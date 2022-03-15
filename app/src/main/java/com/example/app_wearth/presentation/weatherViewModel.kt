package com.example.app_wearth.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import com.example.app_wearth.core.Resource
import com.example.app_wearth.repository.weatherRepository
import kotlinx.coroutines.Dispatchers
import java.lang.Exception

class weatherViewModel(private val repo:weatherRepository, private val city:String): ViewModel() {
    fun fetchWeatherU()= liveData(Dispatchers.IO){
        emit(Resource.Loading())
        try {
           emit(Resource.Success(repo.getCity(city)))
        }catch(e:Exception){
            emit(Resource.Failed(e))
        }
    }
}

class weatherViewModelFactory(private val repo:weatherRepository):ViewModelProvider.Factory{

}