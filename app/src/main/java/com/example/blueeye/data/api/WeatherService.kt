package com.example.blueeye.data.api

import com.example.blueeye.BuildConfig
import com.example.blueeye.data.model.current.CurrentWeatherResponse
import com.example.blueeye.data.model.forecast.ForecastResponse
import com.example.blueeye.utils.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {

    @GET("data/2.5/weather")
    suspend fun getCurrentWeatherByCityName(
        @Query("q") q: String,
        @Query("units") units: String = Constants.UNITS,
        @Query("appid") appId: String = BuildConfig.API_KEY
    ): Response<CurrentWeatherResponse>

    @GET("data/2.5/weather")
    suspend fun getCurrentWeatherByLatLng(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("units") units: String = Constants.UNITS,
        @Query("appid") appId: String = BuildConfig.API_KEY
    ): Response<CurrentWeatherResponse>

    @GET("data/2.5/forecast")
    suspend fun get16DailyForecast(
            @Query("lat") lat: Double,
            @Query("lon") lon: Double,
            @Query("cnt") count: Int = 3,
            @Query("units") units: String = Constants.UNITS,
            @Query("appid") appId: String = BuildConfig.API_KEY
    ): Response<ForecastResponse>
}