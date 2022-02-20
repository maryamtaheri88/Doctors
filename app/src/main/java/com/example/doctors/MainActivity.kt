package com.example.doctors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.doctors.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        this.setTitle(getString(R.string.Pediatrician))


        binding.textDoctorsName.text = intent.getStringExtra("name")
        binding.textDoctorsAdresse.text =  intent.getStringExtra("address")
        binding.textDoctorphone.text = intent.getIntExtra("phone",0).toString()

    }
}