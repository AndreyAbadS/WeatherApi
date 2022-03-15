package com.example.app_wearth.data.model.CallService

data class weather(
    val city: City,
    val cnt: Int,
    val cod: String,
    val list: List<weatherList>,
    val message: Int
)