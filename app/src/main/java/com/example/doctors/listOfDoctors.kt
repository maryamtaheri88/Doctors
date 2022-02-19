package com.example.doctors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.doctors.databinding.ActivityListOfDoctorsBinding
import com.example.doctors.databinding.ActivityMainBinding

class listOfDoctors : AppCompatActivity() {

    lateinit var binding:ActivityListOfDoctorsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityListOfDoctorsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        listener()
    }

    private fun listener() {

        var pediatrician = Pediatrician()

        binding.aliAhmadi.setOnClickListener{


             var aliAhmadi= Intent(this, MainActivity::class.java)

            aliAhmadi.putExtra("name",pediatrician.listOfPediatrician[0].name)
            aliAhmadi.putExtra("address",pediatrician.listOfPediatrician[0].address)
            aliAhmadi.putExtra("phone",pediatrician.listOfPediatrician[0].phone)

            startActivity(aliAhmadi)
        }
    }
}