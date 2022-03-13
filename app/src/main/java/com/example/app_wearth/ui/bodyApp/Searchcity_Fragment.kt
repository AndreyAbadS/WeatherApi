package com.example.app_wearth.ui.bodyApp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.app_wearth.R
import com.example.app_wearth.databinding.FragmentSearchcityBinding

class Searchcity_Fragment : Fragment(R.layout.fragment_searchcity_) {
    private lateinit var binding:FragmentSearchcityBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSearchcityBinding.bind(view)
    }
}