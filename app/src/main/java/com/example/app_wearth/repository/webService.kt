package com.example.app_wearth.repository

import com.example.app_wearth.core.Urls
import com.example.app_wearth.data.model.CallService.weather
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

interface webService {
    @GET("weather?q={id}&appid=${Urls.Api_key}}")
    suspend fun getCity(@Path("id") id:String) : weather

    object RetrofitWeb{
        val website by lazy {
            Retrofit.Builder()
                .baseUrl(Urls.Url_static)
                .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
                .build().create(webService::class.java)
        }
    }

}