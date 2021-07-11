package com.example.blueeye.utils

import android.graphics.drawable.Drawable
import com.example.blueeye.R

object WeatherUtils {

    fun customIcons(iconName: String?): Int {
        return when (iconName) {
            "01d" -> R.drawable.ic_sun
            "02d" -> R.drawable.ic_sun_cloud
            "03d" -> R.drawable.ic_cloud
            "04d" -> R.drawable.ic_cloud
            "09d" -> R.drawable.ic_rain
            "10d" -> R.drawable.ic_night_sun_rain
            "11d" -> R.drawable.ic_thunder
            "13d" -> R.drawable.ic_rain
            "50d" -> R.drawable.ic_wind

            "01n" -> R.drawable.ic_night_sun
            "02n" -> R.drawable.ic_night_sun_cloud
            "03n" -> R.drawable.ic_cloud
            "04n" -> R.drawable.ic_cloud
            "09n" -> R.drawable.ic_rain
            "10n" -> R.drawable.ic_night_sun_rain
            "11n" -> R.drawable.ic_thunder
            "13n" -> R.drawable.ic_rain
            "50n" -> R.drawable.ic_wind

            else -> R.mipmap.ic_launcher
        }
    }
}