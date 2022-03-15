package com.example.app_wearth.repository

import com.example.app_wearth.data.model.CallService.weather
import com.example.app_wearth.data.remote.weatherDaSource

class weatherRepositoryImpl(private val dataSource: weatherDaSource): weatherRepository {
    override suspend fun getCity(city: String): weather = dataSource.getCity()
}