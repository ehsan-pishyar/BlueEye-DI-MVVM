package com.example.blueeye.data.model

import com.google.gson.annotations.SerializedName

data class ResponseList(
        @SerializedName("dt")
        val dt: Long,
        @SerializedName("main")
        val main: Main,
        @SerializedName("weather")
        val weather: List<Weather>,
        @SerializedName("clouds")
        val clouds: Clouds,
        @SerializedName("wind")
        val wind: Wind,
        @SerializedName("visibility")
        val visibility: Long?,
        @SerializedName("pop")
        val pop: Double?,
        @SerializedName("rain")
        val rain: Rain,
        @SerializedName("sys")
        val sys: Sys,
        @SerializedName("dt_text")
        val dtText: String,
        @SerializedName("city")
        val city: City,
)

