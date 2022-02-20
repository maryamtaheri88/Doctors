package com.example.doctors

class Pediatrician {
    var listOfPediatrician = ArrayList<DoctorInfo>()

    constructor(){
        addlistOfPediatrician()
    }

    var doctor1 = DoctorInfo("Ali Ahmadi","Shahrake gharb", 463846)
    var doctor2 = DoctorInfo("Mina Sadeghi","Tajrish",483837)
    var doctor3 = DoctorInfo("Maryam Alavi","Monirie",1241233)
    var doctor4 = DoctorInfo("Shahab Mohamadi","Shosh",7394739)
    var doctor5 = DoctorInfo("Shirin Alavi","enghelab",635728)


    fun addlistOfPediatrician(){
        listOfPediatrician.add(doctor1)
        listOfPediatrician.add(doctor2)
        listOfPediatrician.add(doctor3)
        listOfPediatrician.add(doctor4)
        listOfPediatrician.add(doctor5)
    }
}