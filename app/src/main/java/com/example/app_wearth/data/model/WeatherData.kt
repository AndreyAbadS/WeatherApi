package com.example.app_wearth.data.model

data class weatherData(
    val coord: Coord,
    val weather: List<WeatherElement>
)

data class Coord (
    val lon:Double,
    val lat: Double
    )

data class WeatherElement(
    val id: Long,
    val main: String,
    val description: String,
    val icon:String
)