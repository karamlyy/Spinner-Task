package com.example.spinnertask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
//comment from Shalala 1
class MainActivity : AppCompatActivity() {
    var list = mutableListOf<String>("Baku", "Ankara", "Madrid", "Paris")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list)
        spinner.adapter = adapter
    }

    fun setUpClickListeners() {
        binding.button.setOnClickListener {
            save()
        }
    }

}