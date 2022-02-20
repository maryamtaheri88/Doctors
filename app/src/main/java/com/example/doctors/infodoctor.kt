package com.example.doctors

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.doctors.databinding.ActivityListOfDoctorsBinding
import com.example.doctors.databinding.FragmentInfodoctorBinding

class infodoctor : Fragment() {

    lateinit var binding: FragmentInfodoctorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInfodoctorBinding.inflate(layoutInflater,container,false)



        return binding.root
    }

}