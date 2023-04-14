package com.example.gson

import com.google.gson.annotations.SerializedName

class Address {

    @SerializedName("country")
    val  mCountry : String

    @SerializedName("city")
    val  mcity : String

    constructor(country: String,city:String){
        mCountry = country
        mcity = city
    }
}