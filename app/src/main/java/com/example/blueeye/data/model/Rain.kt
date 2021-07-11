package com.example.blueeye.data.model

import com.google.gson.annotations.SerializedName

data class Rain(
        @SerializedName("3h")
        val rain3h: Double?
)
