package com.example.blueeye.ui.main.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0002J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0002J\b\u0010\u001b\u001a\u00020\u0015H\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u0015H\u0002J\b\u0010\u001e\u001a\u00020\u0015H\u0002J\b\u0010\u001f\u001a\u00020\u0015H\u0002J\b\u0010 \u001a\u00020\u0017H\u0002J\b\u0010!\u001a\u00020\u0015H\u0003J-\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$2\u000e\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190&2\u0006\u0010\'\u001a\u00020(H\u0016\u00a2\u0006\u0002\u0010)J\u001a\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u00060"}, d2 = {"Lcom/example/blueeye/ui/main/fragment/MainFragment;", "Landroidx/fragment/app/Fragment;", "()V", "forecastAdapter", "Lcom/example/blueeye/ui/adapter/ForecastAdapter;", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "lat", "", "locationCallback", "Lcom/google/android/gms/location/LocationCallback;", "locationRequest", "Lcom/google/android/gms/location/LocationRequest;", "lon", "viewModel", "Lcom/example/blueeye/ui/viewmodel/WeatherViewModel;", "getViewModel", "()Lcom/example/blueeye/ui/viewmodel/WeatherViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "addLatLngToViewModel", "", "checkPermission", "", "getCityName", "", "getCountryName", "getLastLocation", "initBottomSheet", "initCurrentWeatherByLatLng", "initRecyclerView", "initUi", "isLocationEnabled", "newLocationData", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "requestPermission", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.example.blueeye.ui.adapter.ForecastAdapter forecastAdapter;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient;
    private com.google.android.gms.location.LocationRequest locationRequest;
    private double lat = 0.0;
    private double lon = 0.0;
    private final com.google.android.gms.location.LocationCallback locationCallback = null;
    private java.util.HashMap _$_findViewCache;
    
    public MainFragment() {
        super();
    }
    
    private final com.example.blueeye.ui.viewmodel.WeatherViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initCurrentWeatherByLatLng() {
    }
    
    private final void addLatLngToViewModel(double lat, double lon) {
    }
    
    private final void initRecyclerView() {
    }
    
    private final void initUi() {
    }
    
    private final void initBottomSheet() {
    }
    
    private final boolean checkPermission() {
        return false;
    }
    
    private final void requestPermission() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final boolean isLocationEnabled() {
        return false;
    }
    
    private final void getLastLocation() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void newLocationData() {
    }
    
    private final java.lang.String getCityName(double lat, double lon) {
        return null;
    }
    
    private final java.lang.String getCountryName(double lat, double lon) {
        return null;
    }
}