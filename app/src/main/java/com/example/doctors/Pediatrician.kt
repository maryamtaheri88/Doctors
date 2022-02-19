package com.example.doctors

class Pediatrician {
    var listOfPediatrician = ArrayList<DoctorInfo>()

    constructor(){
        addlistOfPediatrician()
    }

    var doctor1 = DoctorInfo("ali ahmadi","Shahrake gharb", 463846)
    var doctor2 = DoctorInfo("mina sadeghi","Tajrish",483837)
    var doctor3 = DoctorInfo("maryam alavi","Monirie",1241233)
    var doctor4 = DoctorInfo("shahab mohamadi","Shosh",7394739)
    var doctor5 = DoctorInfo("shirin alavi","enghelab",635728)


    fun addlistOfPediatrician(){
        listOfPediatrician.add(doctor1)
        listOfPediatrician.add(doctor2)
        listOfPediatrician.add(doctor3)
        listOfPediatrician.add(doctor4)
        listOfPediatrician.add(doctor5)
    }
}