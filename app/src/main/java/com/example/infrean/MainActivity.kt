package com.example.infrean

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.room.Room
import com.example.infrean.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =  DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        binding.lifecycleOwner = this

        val viewModel: MainViewModel by viewModels()
        binding.viewModel =viewModel

    }
}