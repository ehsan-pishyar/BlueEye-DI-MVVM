package com.example.blueeye.ui.main.fragment.bottomsheets;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0014"}, d2 = {"Lcom/example/blueeye/ui/main/fragment/bottomsheets/BottomSheetFragmentMain;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "forecastAdapter", "Lcom/example/blueeye/ui/adapter/ForecastAdapter;", "lat", "", "lon", "viewModel", "Lcom/example/blueeye/ui/viewmodel/WeatherViewModel;", "getViewModel", "()Lcom/example/blueeye/ui/viewmodel/WeatherViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class BottomSheetFragmentMain extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.example.blueeye.ui.adapter.ForecastAdapter forecastAdapter;
    private double lat = 0.0;
    private double lon = 0.0;
    private java.util.HashMap _$_findViewCache;
    
    public BottomSheetFragmentMain() {
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
}