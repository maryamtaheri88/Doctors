package com.example.doctors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.doctors.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var name = intent.getStringExtra("name")
        var address = intent.getStringExtra("address")
        var phone = intent.getIntExtra("phone",0)

        binding.textDoctorsName.text = name
        binding.textDoctorsAdresse.text = address
        binding.textDoctorphone.text = phone.toString()
    }


}