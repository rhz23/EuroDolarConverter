package com.rzaninelli.eurodolarconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rzaninelli.eurodolarconverter.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {
            val euros : Double = binding.editEuro.text.toString().toDouble()
//            val dolares = String.format("%.2f", euros * 0.8)

            val dolares = (euros * 0.8 * 100).roundToInt().toDouble()/100

            binding.textViewDolares.text = "${dolares} $"
        }
    }
}