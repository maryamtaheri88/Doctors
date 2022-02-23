package com.example.doctors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import com.example.doctors.databinding.ActivityMainBinding

  const val DOCTOR = ""

class MainActivity : AppCompatActivity() {

    lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val getInfo = intent.getParcelableExtra<DoctorInfo>(DOCTOR)


        binding.textDoctorsName.text = getInfo?.name
        binding.textDoctorsAdresse.text = getInfo?.name
        binding.textDoctorPhone.text = getInfo?.phone?.toString()


             this.title= getInfo?.name

    }
}