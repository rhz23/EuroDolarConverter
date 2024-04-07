package com.rzaninelli.eurodolarconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rzaninelli.eurodolarconverter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {
            val euros : Double = binding.editEuro.text.toString().toDouble()
            val dolares = euros * 0.8

            binding.textViewDolares.text = dolares.toString();
        }
    }
}