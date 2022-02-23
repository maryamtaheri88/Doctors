package com.example.doctors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.doctors.databinding.ActivityMainBinding

  const val DOCTOR = ""

class MainActivity : AppCompatActivity() {

    lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val getInfo = intent.getParcelableExtra<DoctorInfo>(DOCTOR)

        this.title= getInfo?.name


        binding.textDoctorsName.text = getInfo?.name
        binding.textDoctorsAdresse.text =  getInfo?.address
        binding.textDoctorphone.text = getInfo?.phone.toString()

    }
}