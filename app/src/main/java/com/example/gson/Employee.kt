package com.example.gson

import com.google.gson.annotations.SerializedName

class Employee {
    private val firstname : String
    private val age : Int
    private val mail :String
    @SerializedName("address")
    private val mAddress : Address

    @SerializedName("family")
    private val mFamily : List<FamilyMember>


    constructor(firstname : String,age:Int,mail:String,address: Address,family:List<FamilyMember>){
        this.firstname = firstname
        this.age = age
        this.mail = mail
       mAddress = address
        mFamily = family
    }
}