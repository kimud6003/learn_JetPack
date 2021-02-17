package com.example.infrean

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.infrean.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =  DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        binding.lifecycleOwner = this

        val viewModel: MainViewModel by viewModels()
        binding.viewModel =viewModel

    }
}