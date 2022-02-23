package com.example.doctors

import android.os.Parcelable

import kotlinx.parcelize.Parcelize

@Parcelize

class DoctorInfo( var name:String , var address:String , var phone: Int): Parcelable {
}