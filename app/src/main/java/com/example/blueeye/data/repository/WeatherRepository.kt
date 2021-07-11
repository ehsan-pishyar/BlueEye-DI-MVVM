package com.example.blueeye.data.repository

import com.example.blueeye.data.api.helper.WeatherServiceHelper
import javax.inject.Inject

class WeatherRepository @Inject constructor(
        private val weatherServiceHelper: WeatherServiceHelper
        ) {

    suspend fun getCurrentWeatherByCityName(cityName: String) =
            weatherServiceHelper.getCurrentWeatherByCityName(cityName)

    suspend fun getCurrentWeatherByLatLon(lat: Double, lon: Double) =
            weatherServiceHelper.getCurrentWeatherByLatLng(lat, lon)

    suspend fun get16DailyForecast(lat: Double, lon: Double) =
            weatherServiceHelper.get16DailyForecast(lat, lon)
}