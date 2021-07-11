package com.example.blueeye.ui.main.fragment

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.bumptech.glide.Glide
import com.example.blueeye.R
import com.example.blueeye.ui.viewmodel.WeatherViewModel
import com.example.blueeye.utils.WeatherUtils
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_search.*
import kotlinx.coroutines.Job
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class SearchFragment: Fragment(R.layout.fragment_search) {

    private val viewModel by viewModels<WeatherViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        etxt_search.doOnTextChanged { text, start, count, after ->
            if (text!!.length < 3){
                etxt_search.error = "At least 3 chars"
                txt_input_search.isEndIconVisible = false
            } else {
                txt_input_search.isEndIconVisible = true
                txt_input_search.setEndIconDrawable(R.drawable.ic_search_inactive)
                etxt_search.error = null
                onSearchButtonClick()
            }
        }
    }

    private fun onSearchButtonClick(){
        txt_input_search.setEndIconOnClickListener {
            val cityName = etxt_search.text.toString().trim()

            txt_city_name_search.visibility = View.VISIBLE
            txt_weather_description_search.visibility = View.VISIBLE
            txt_degree_search.visibility = View.VISIBLE
            img_degree_icon_search.visibility = View.VISIBLE
            img_icon_search.visibility = View.VISIBLE
            txt_wind_search.visibility = View.VISIBLE
            txt_humidity_search.visibility = View.VISIBLE
            txt_wind_speed_search.visibility = View.VISIBLE
            txt_humidity_percent_search.visibility = View.VISIBLE
            not_found_search.visibility = View.GONE
            addCityNameToViewModel(cityName)
            initUi()
        }
    }

    private fun addCityNameToViewModel(cityName: String){
        viewModel.getCurrentWeatherByCityName(cityName)
    }

    private fun initUi(){
        viewModel.getCurrentWeatherByCityName.observe(viewLifecycleOwner, { weather ->
            txt_city_name_search.text = weather.data?.name
            txt_weather_description_search.text = weather.data?.weather?.get(0)?.description
            txt_degree_search.text = weather.data?.main?.temp.toString().substringBefore(".")
            val icon = weather.data?.weather?.get(0)?.icon
            val customIcon = WeatherUtils.customIcons(icon)
            Glide.with(requireContext()).load(customIcon).into(img_icon_search)
            txt_wind_speed_search.text = "${weather.data?.wind?.speed} Km/h"
            txt_humidity_percent_search.text = "${weather.data?.main?.humidity}%"
        })
    }
}