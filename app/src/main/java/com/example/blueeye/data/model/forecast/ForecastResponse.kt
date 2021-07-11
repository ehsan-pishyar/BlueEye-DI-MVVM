package com.example.blueeye.data.model.forecast

import com.example.blueeye.data.model.City
import com.example.blueeye.data.model.ResponseList
import com.google.gson.annotations.SerializedName

data class ForecastResponse(
        @SerializedName("cod")
        val cod: String?,
        @SerializedName("message")
        val message: Int?,
        @SerializedName("cnt")
        val cnt: Int?,
        @SerializedName("list")
        val responseList: List<ResponseList>
)
