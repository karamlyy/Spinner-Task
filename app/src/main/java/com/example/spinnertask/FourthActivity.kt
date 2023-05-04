package com.example.spinnertask

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.spinnertask.databinding.ActivityMainBinding

class FourthActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}