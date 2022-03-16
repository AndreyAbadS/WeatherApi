package com.example.app_wearth.ui.bodyApp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.app_wearth.R
import com.example.app_wearth.core.Resource
import com.example.app_wearth.data.remote.weatherDaSource
import com.example.app_wearth.databinding.FragmentSearchcityBinding
import com.example.app_wearth.presentation.weatherViewModel
import com.example.app_wearth.presentation.weatherViewModelFactory
import com.example.app_wearth.repository.weatherRepositoryImpl
import com.example.app_wearth.repository.webService

class Searchcity_Fragment : Fragment(R.layout.fragment_searchcity_) {
    private lateinit var binding: FragmentSearchcityBinding
    private val viewModel by viewModels<weatherViewModel> {
        weatherViewModelFactory(
            weatherRepositoryImpl(
                weatherDaSource(
                    binding.edSearchCity.text.toString(),
                    webService.RetrofitWeb.website
                )
            )
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSearchcityBinding.bind(view)
        binding.btnSearchCity.setOnClickListener {
            binding.edSearchCity.text.toString()
        }
        viewModel.fetchWeatherU().observe(viewLifecycleOwner, Observer {
            Log.d("Weather","${it.toString()}")
        })
    }
}