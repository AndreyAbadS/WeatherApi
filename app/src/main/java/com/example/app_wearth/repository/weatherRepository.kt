package com.example.app_wearth.repository

import com.example.app_wearth.data.model.CallService.weather


interface weatherRepository {
    suspend fun getCity(city:String): weather
}