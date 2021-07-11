package com.example.blueeye.data.api.helper

import com.example.blueeye.data.model.current.CurrentWeatherResponse
import com.example.blueeye.data.api.WeatherService
import com.example.blueeye.data.model.forecast.ForecastResponse
import retrofit2.Response
import javax.inject.Inject

class WeatherServiceHelperImpl @Inject constructor(private val weatherService: WeatherService): WeatherServiceHelper {
    override suspend fun getCurrentWeatherByCityName(
        cityName: String
    ): Response<CurrentWeatherResponse> {
        return weatherService.getCurrentWeatherByCityName(cityName)
    }

    override suspend fun getCurrentWeatherByLatLng(
        lat: Double,
        lon: Double
    ): Response<CurrentWeatherResponse> {
        return weatherService.getCurrentWeatherByLatLng(lat, lon)
    }

    override suspend fun get16DailyForecast(
            lat: Double,
            lon: Double
    ): Response<ForecastResponse> {
        return weatherService.get16DailyForecast(lat, lon)
    }
}