package com.example.app_wearth.data.remote

import com.example.app_wearth.data.model.CallService.weather
import com.example.app_wearth.repository.webService

class weatherDaSource(private val city:String, private val webService: webService) {
    suspend fun getCity(): weather= webService.getCity(city)

}

