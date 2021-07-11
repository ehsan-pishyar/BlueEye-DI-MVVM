package com.example.blueeye.ui.main.fragment

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageManager
import android.location.Geocoder
import android.location.Location
import android.location.LocationManager
import android.os.Bundle
import android.os.Looper
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.blueeye.R
import com.example.blueeye.ui.adapter.ForecastAdapter
import com.example.blueeye.ui.viewmodel.WeatherViewModel
import com.example.blueeye.utils.Constants
import com.example.blueeye.utils.NetworkConnection
import com.example.blueeye.utils.WeatherUtils
import com.google.android.gms.location.*
import com.google.android.material.bottomsheet.BottomSheetBehavior
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.*

@AndroidEntryPoint
class MainFragment: Fragment(R.layout.fragment_main) {

    private val viewModel by viewModels<WeatherViewModel>()
    private lateinit var forecastAdapter: ForecastAdapter
    private lateinit var networkConnection: NetworkConnection

    private lateinit var fusedLocationClient: FusedLocationProviderClient
    private lateinit var locationRequest: LocationRequest

    private var lat: Double = 0.00
    private var lon: Double = 0.00

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        networkConnection = NetworkConnection(requireContext())
        networkConnection.observe(viewLifecycleOwner, { isConnected ->
            if (isConnected){
                fusedLocationClient = LocationServices.getFusedLocationProviderClient(requireContext())

                CoroutineScope(IO).launch {
                    getLastLocation()
                    delay(2000)
                    withContext(Main){
                        addLatLngToViewModel(lat, lon)
                        initCurrentWeatherByLatLng()
                    }
                }
            }else {
                Toast.makeText(requireContext(), "Enable Interner Conection", Toast.LENGTH_LONG).show()
            }
        })
    }

    private fun initCurrentWeatherByLatLng(){
        viewModel.getCurrentWeatherByLatLng.observe(viewLifecycleOwner, { weather ->
            txt_city_name_main.text = weather.data?.name
            txt_weather_description_main.text = weather.data?.weather?.get(0)?.description
            txt_degree.text = weather.data?.main?.temp.toString().substringBefore(".")
            img_degree_icon.visibility = View.VISIBLE
            val weatherIcon = weather.data?.weather?.get(0)?.icon
            val customWeatherIcon = WeatherUtils.customIcons(weatherIcon)
            Glide.with(requireContext()).load(customWeatherIcon).into(img_icon)
            txt_wind_main.visibility = View.VISIBLE
            txt_humidity_main.visibility = View.VISIBLE
            txt_wind_speed_main.text = "${weather.data?.wind?.speed} Km/h"
            txt_humidity_percent_main.text = "${weather.data?.main?.humidity}%"
            initBottomSheet()
        })
    }

    private fun addLatLngToViewModel(lat: Double, lon: Double){
        viewModel.getCurrentWeatherByLatLng(lat, lon)
        viewModel.get5DaysForecast(lat, lon)
    }

    private fun initRecyclerView(){
        forecastAdapter = ForecastAdapter()
        recycler_bottom_sheet.apply {
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
            adapter = forecastAdapter
        }
    }

    private fun initUi(){
        viewModel.get5DaysForecast.observe(viewLifecycleOwner, { responseList ->
            responseList.data?.responseList?.let { forecastAdapter.differ.submitList(it) }
        })
    }

    private fun initBottomSheet(){
        BottomSheetBehavior.from(frame_bottom_sheet).apply {
            peekHeight = 40
            this.state = BottomSheetBehavior.STATE_COLLAPSED
        }
        initRecyclerView()
        initUi()
    }

    private fun checkPermission(): Boolean{
        //this function will return a boolean
        //true: if we have permission
        //false if not
        if(
            ActivityCompat.checkSelfPermission(requireContext(),
                Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED ||
            ActivityCompat.checkSelfPermission(requireContext(),
                Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED
        ){
            Log.d("PERMISSION: ", "App has access requierd permissions")
            return true
        }
        Log.e("PERMISSION: ", "App has not access requierd permissions")
        return false

    }

    private fun requestPermission(){
        //this function will allows us to tell the user to request the necessary permission if they are not granted
        ActivityCompat.requestPermissions(
            requireActivity(),
            arrayOf(
                Manifest.permission.ACCESS_COARSE_LOCATION,
                Manifest.permission.ACCESS_FINE_LOCATION
            ),
            Constants.PERMISSION_ID
        )
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        if (requestCode == Constants.PERMISSION_ID){
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                Log.d("Permission: ", "Permission Granted")
            }else{
                Log.e("Permission: ", "Permission Declined!")
                activity?.finish()
            }
        }
    }

    private fun isLocationEnabled(): Boolean{
        //this function will return to us the state of the location service
        //if the GPS or the network provider is enabled then it will return true otherwise it will return false
        val locationManager = context?.getSystemService(Context.LOCATION_SERVICE) as LocationManager
        val hasProvider = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER) ||
                locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)

        if (hasProvider){
            Log.d("PROVIDER: ", "Has providers")
            return true
        }else
            Log.e("PROVIDER: ", "Has not providers")
            Toast.makeText(requireContext(), "Enable your Location from settings", Toast.LENGTH_LONG).show()
            return false
    }

    private fun getLastLocation(){
        if(checkPermission()){
            if(isLocationEnabled()){
                fusedLocationClient.lastLocation.addOnCompleteListener { task ->
                    val location: Location? = task.result
                    if(location == null){
                        Log.e("ERROR: " ,"Your Location: ${location?.latitude}")
                        newLocationData()
                        Log.e("NEW LOCATION: " ,"Your Location: ${location?.latitude}")
                    }else{
                        Log.d("SUCCESS: " ,"Your Location: ${location.latitude}")
                        lat = location.latitude
                        lon = location.longitude
                    }
                }
            }else{
                Toast.makeText(requireContext(),"Please Turn on Your device Location", Toast.LENGTH_SHORT).show()
            }
        }else{
            requestPermission()
        }
    }

    @SuppressLint("MissingPermission")
    private fun newLocationData(){
        locationRequest = LocationRequest.create().apply {
            priority = LocationRequest.PRIORITY_HIGH_ACCURACY
            interval = 0
            fastestInterval = 0
            numUpdates = 1
        }
        fusedLocationClient.requestLocationUpdates(
            locationRequest, locationCallback, Looper.myLooper()!!
        )
    }

    private val locationCallback = object : LocationCallback(){
        @SuppressLint("LogNotTimber")
        override fun onLocationResult(locationResult: LocationResult) {
            val lastLocation: Location = locationResult.lastLocation
            Log.d("Debug: ","your last location: ${lastLocation.latitude}")
            lat = lastLocation.latitude
            lon = lastLocation.longitude
        }
    }

    private fun getCityName(lat: Double, lon: Double): String {
        val geoCoder = Geocoder(requireContext(), Locale.getDefault())
        val address = geoCoder.getFromLocation(lat, lon,3)

        return address.get(0).locality
    }

    private fun getCountryName(lat: Double, lon: Double): String {
        val geocoder = Geocoder(requireContext(), Locale.getDefault())
        val address = geocoder.getFromLocation(lat, lon, 3)

        return address.get(0).countryName
    }
}