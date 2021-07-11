package com.example.blueeye.data.model

import com.google.gson.annotations.SerializedName

data class City(
        @SerializedName("id")
        val id: Long?,
        @SerializedName("name")
        val name: String?,
        @SerializedName("coord")
        val coord: Coord?,
        @SerializedName("country")
        val country: String?,
        @SerializedName("population")
        val population: Int?,
        @SerializedName("timezone")
        val timezone: Long?
)
