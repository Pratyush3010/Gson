package com.example.gson

import com.google.gson.annotations.SerializedName

class FamilyMember {

    @SerializedName("role")
    private val mRole : String

    @SerializedName("age")
    private val mAge : Int

    constructor(role : String ,age : Int){
        mRole = role
        mAge = age
    }
}