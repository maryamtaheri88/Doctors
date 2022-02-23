package com.example.doctors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.doctors.databinding.ActivityListOfDoctorsBinding
import com.example.doctors.databinding.ActivityMainBinding

class listOfDoctors : AppCompatActivity() {

    lateinit var binding: ActivityListOfDoctorsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityListOfDoctorsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        listener()
    }

    fun gotoActivity(doctor: DoctorInfo) {

        var intent = Intent(this, MainActivity::class.java)

        intent.putExtra(DOCTOR,doctor )

        startActivity(intent)
    }


    private fun listener() {

        var pediatrician = Pediatrician()

        binding.aliAhmadi.setOnClickListener {
            gotoActivity(pediatrician.listOfPediatrician[0])
        }


        binding.minaSadeghi.setOnClickListener {
            gotoActivity(pediatrician.listOfPediatrician[1])
        }

        binding.maryamAlavi.setOnClickListener {
            gotoActivity(pediatrician.listOfPediatrician[2])
        }

        binding.shahabMohamadi.setOnClickListener {
            gotoActivity(pediatrician.listOfPediatrician[3])
        }

        binding.shirinAlavi.setOnClickListener {
            gotoActivity(pediatrician.listOfPediatrician[4])
        }
    }
}




