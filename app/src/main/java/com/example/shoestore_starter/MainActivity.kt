package com.example.shoestore_starter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shoestore_starter.databinding.ActivityMainBinding
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        Timber.plant(Timber.DebugTree())
    }
}