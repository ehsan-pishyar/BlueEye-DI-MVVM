package com.example.blueeye.data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/example/blueeye/data/di/WeatherModule;", "", "()V", "provideBaseUrl", "", "provideRetrofit", "Lretrofit2/Retrofit;", "url", "provideWeatherApiService", "Lcom/example/blueeye/data/api/helper/WeatherServiceHelper;", "weatherServiceHelperImpl", "Lcom/example/blueeye/data/api/helper/WeatherServiceHelperImpl;", "provideWeatherService", "Lcom/example/blueeye/data/api/WeatherService;", "retrofit", "app_debug"})
@dagger.Module()
public final class WeatherModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.blueeye.data.di.WeatherModule INSTANCE = null;
    
    private WeatherModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final java.lang.String provideBaseUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.blueeye.data.api.WeatherService provideWeatherService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.blueeye.data.api.helper.WeatherServiceHelper provideWeatherApiService(@org.jetbrains.annotations.NotNull()
    com.example.blueeye.data.api.helper.WeatherServiceHelperImpl weatherServiceHelperImpl) {
        return null;
    }
}