package com.famous.covid19detector

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.famous.covid19detector.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.checkBtn.setOnClickListener{
            startActivity(Intent(this, Question::class.java))
        }

        binding.maleriaBtn.setOnClickListener{
            startActivity(Intent(this, MaleriaActivity::class.java))
        }

    }
}