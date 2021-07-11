package com.example.blueeye.ui.main.fragment.bottomsheets

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.blueeye.ui.adapter.ForecastAdapter
import com.example.blueeye.ui.viewmodel.WeatherViewModel
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BottomSheetFragmentMain : BottomSheetDialogFragment() {

    private val viewModel by viewModels<WeatherViewModel>()
    private lateinit var forecastAdapter: ForecastAdapter

    private var lat: Double = 0.00
    private var lon: Double = 0.00

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }


}