package com.example.blueeye.data.model

import com.google.gson.annotations.SerializedName

data class FeelsLike(
        @SerializedName("day")
        val day: Double?,
        @SerializedName("night")
        val night: Double?,
        @SerializedName("eve")
        val evening: Double?,
        @SerializedName("morn")
        val morning: Double?
)
