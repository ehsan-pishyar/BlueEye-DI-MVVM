package com.example.blueeye.ui.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u0010\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u0012\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/blueeye/ui/viewmodel/WeatherViewModel;", "Landroidx/lifecycle/ViewModel;", "weatherRepository", "Lcom/example/blueeye/data/repository/WeatherRepository;", "(Lcom/example/blueeye/data/repository/WeatherRepository;)V", "_get5DaysForecast", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/blueeye/utils/Resource;", "Lcom/example/blueeye/data/model/forecast/ForecastResponse;", "_getCurrentWeatherByCityName", "Lcom/example/blueeye/data/model/current/CurrentWeatherResponse;", "_getCurrentWeatherByLatLng", "get5DaysForecast", "Landroidx/lifecycle/LiveData;", "getGet5DaysForecast", "()Landroidx/lifecycle/LiveData;", "getCurrentWeatherByCityName", "getGetCurrentWeatherByCityName", "getCurrentWeatherByLatLng", "getGetCurrentWeatherByLatLng", "Lkotlinx/coroutines/Job;", "lat", "", "lon", "q", "", "app_debug"})
public final class WeatherViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.blueeye.data.repository.WeatherRepository weatherRepository = null;
    private final androidx.lifecycle.MutableLiveData<com.example.blueeye.utils.Resource<com.example.blueeye.data.model.current.CurrentWeatherResponse>> _getCurrentWeatherByCityName = null;
    private final androidx.lifecycle.MutableLiveData<com.example.blueeye.utils.Resource<com.example.blueeye.data.model.current.CurrentWeatherResponse>> _getCurrentWeatherByLatLng = null;
    private final androidx.lifecycle.MutableLiveData<com.example.blueeye.utils.Resource<com.example.blueeye.data.model.forecast.ForecastResponse>> _get5DaysForecast = null;
    
    @javax.inject.Inject()
    public WeatherViewModel(@org.jetbrains.annotations.NotNull()
    com.example.blueeye.data.repository.WeatherRepository weatherRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.blueeye.utils.Resource<com.example.blueeye.data.model.current.CurrentWeatherResponse>> getGetCurrentWeatherByCityName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.blueeye.utils.Resource<com.example.blueeye.data.model.current.CurrentWeatherResponse>> getGetCurrentWeatherByLatLng() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.blueeye.utils.Resource<com.example.blueeye.data.model.forecast.ForecastResponse>> getGet5DaysForecast() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getCurrentWeatherByLatLng(double lat, double lon) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getCurrentWeatherByCityName(@org.jetbrains.annotations.NotNull()
    java.lang.String q) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job get5DaysForecast(double lat, double lon) {
        return null;
    }
}