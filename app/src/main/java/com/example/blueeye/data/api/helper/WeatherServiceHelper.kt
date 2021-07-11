package com.example.blueeye.data.api.helper

import com.example.blueeye.data.model.current.CurrentWeatherResponse
import com.example.blueeye.data.model.forecast.ForecastResponse
import retrofit2.Response

interface WeatherServiceHelper {

    suspend fun getCurrentWeatherByCityName(cityName: String): Response<CurrentWeatherResponse>

    suspend fun getCurrentWeatherByLatLng(lat: Double, lon: Double): Response<CurrentWeatherResponse>

    suspend fun get16DailyForecast(lat: Double, lon: Double): Response<ForecastResponse>
}