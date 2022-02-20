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

        binding.minaSadeghi.setOnClickListener{


            var minaSadeghi= Intent(this, MainActivity::class.java)

            minaSadeghi.putExtra("name",pediatrician.listOfPediatrician[1].name)
            minaSadeghi.putExtra("address",pediatrician.listOfPediatrician[1].address)
            minaSadeghi.putExtra("phone",pediatrician.listOfPediatrician[1].phone)

            startActivity(minaSadeghi)
        }

        binding.maryamAlavi.setOnClickListener{


            var maryamAlavi= Intent(this, MainActivity::class.java)

            maryamAlavi.putExtra("name",pediatrician.listOfPediatrician[2].name)
            maryamAlavi.putExtra("address",pediatrician.listOfPediatrician[2].address)
            maryamAlavi.putExtra("phone",pediatrician.listOfPediatrician[2].phone)

            startActivity(maryamAlavi)
        }


        binding.shahabMohamadi.setOnClickListener{


            var shahabMohamadi= Intent(this, MainActivity::class.java)

            shahabMohamadi.putExtra("name",pediatrician.listOfPediatrician[3].name)
            shahabMohamadi.putExtra("address",pediatrician.listOfPediatrician[3].address)
            shahabMohamadi.putExtra("phone",pediatrician.listOfPediatrician[3].phone)

            startActivity(shahabMohamadi)
        }

        binding.shirinAlavi.setOnClickListener{


            var shirinAlavi= Intent(this, MainActivity::class.java)

            shirinAlavi.putExtra("name",pediatrician.listOfPediatrician[4].name)
            shirinAlavi.putExtra("address",pediatrician.listOfPediatrician[4].address)
            shirinAlavi.putExtra("phone",pediatrician.listOfPediatrician[4].phone)

            startActivity(shirinAlavi)
        }

    }
}