package com.example.blueeye.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.blueeye.data.model.current.CurrentWeatherResponse
import com.example.blueeye.data.model.forecast.ForecastResponse
import com.example.blueeye.data.repository.WeatherRepository
import com.example.blueeye.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(
        private val weatherRepository: WeatherRepository
        ): ViewModel(){

    private val _getCurrentWeatherByCityName = MutableLiveData<Resource<CurrentWeatherResponse>>()
    val getCurrentWeatherByCityName: LiveData<Resource<CurrentWeatherResponse>> get() = _getCurrentWeatherByCityName

    private val _getCurrentWeatherByLatLng = MutableLiveData<Resource<CurrentWeatherResponse>>()
    val getCurrentWeatherByLatLng: LiveData<Resource<CurrentWeatherResponse>> get() = _getCurrentWeatherByLatLng

    private val _get5DaysForecast = MutableLiveData<Resource<ForecastResponse>>()
    val get5DaysForecast: LiveData<Resource<ForecastResponse>> get() = _get5DaysForecast

    fun getCurrentWeatherByLatLng(lat: Double, lon: Double) = viewModelScope.launch {
        _getCurrentWeatherByLatLng.postValue(Resource.loading(null))
        weatherRepository.getCurrentWeatherByLatLon(lat, lon).let { response ->
            if (response.isSuccessful) {
                _getCurrentWeatherByLatLng.value = Resource.success(response.body()!!)
            } else {
                _getCurrentWeatherByLatLng.value = Resource.error(response.errorBody().toString(), null)
            }
        }
    }

    fun getCurrentWeatherByCityName(q: String) = viewModelScope.launch {
        _getCurrentWeatherByCityName.value = Resource.loading(null)
        weatherRepository.getCurrentWeatherByCityName(q).let { response ->
            if (response.isSuccessful){
                _getCurrentWeatherByCityName.value = Resource.success(response.body()!!)
            }else _getCurrentWeatherByCityName.value = Resource.error(
                    "Error code: ${response.code()} - " +
                            "error message: ${response.errorBody()}", null
            )
        }
    }

    fun get5DaysForecast(lat: Double, lon: Double) = viewModelScope.launch {
        _get5DaysForecast.value = Resource.loading(null)
        weatherRepository.get16DailyForecast(lat, lon).let { response ->
            if (response.isSuccessful){
                _get5DaysForecast.value = Resource.success(response.body()!!)
            }else _get5DaysForecast.value = Resource.error(
                    "code: ${response.code()}" +
                            " - message: ${response.message()}" +
                            " - body: ${response.body().toString()}" +
                            " - row message: ${response.raw().message}", null)
        }
    }
}