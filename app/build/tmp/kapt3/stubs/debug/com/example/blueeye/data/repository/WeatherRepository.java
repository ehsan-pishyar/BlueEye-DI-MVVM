package com.example.blueeye.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\'\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/blueeye/data/repository/WeatherRepository;", "", "weatherServiceHelper", "Lcom/example/blueeye/data/api/helper/WeatherServiceHelper;", "(Lcom/example/blueeye/data/api/helper/WeatherServiceHelper;)V", "get16DailyForecast", "Lretrofit2/Response;", "Lcom/example/blueeye/data/model/forecast/ForecastResponse;", "lat", "", "lon", "(DDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentWeatherByCityName", "Lcom/example/blueeye/data/model/current/CurrentWeatherResponse;", "cityName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentWeatherByLatLon", "app_debug"})
public final class WeatherRepository {
    private final com.example.blueeye.data.api.helper.WeatherServiceHelper weatherServiceHelper = null;
    
    @javax.inject.Inject()
    public WeatherRepository(@org.jetbrains.annotations.NotNull()
    com.example.blueeye.data.api.helper.WeatherServiceHelper weatherServiceHelper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCurrentWeatherByCityName(@org.jetbrains.annotations.NotNull()
    java.lang.String cityName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.blueeye.data.model.current.CurrentWeatherResponse>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCurrentWeatherByLatLon(double lat, double lon, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.blueeye.data.model.current.CurrentWeatherResponse>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object get16DailyForecast(double lat, double lon, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.blueeye.data.model.forecast.ForecastResponse>> p2) {
        return null;
    }
}