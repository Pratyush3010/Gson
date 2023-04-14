package com.example.gson

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



           /* val json =
                """{"title": "Kotlin Tutorial #1", "author": "bezkoder", "categories" : ["Kotlin","Basic"]}"""*/

           /* val gson = Gson()

            //val tt1: Modal = gson.fromJson(json, Modal::class.java)
          var modal : Modal = Modal("Book with Golden Pen","Pratyush", listOf("Comic","Horror"))

        val json : String = gson.toJson(modal)*/
      val gson : Gson = Gson()

        val gsonPreety = GsonBuilder().setPrettyPrinting().create()
        /*
              val address : Address = Address("India","Surat")
               val family : List<FamilyMember> = arrayListOf(FamilyMember("Wife",30),FamilyMember("Daughter",20))

               val employee : Employee = Employee("Pratyush",20,"pratyush@gmail.com",address,family)
               val json : String = gson.toJson(family)
       */
 /*  val  json : String = "[{\"age\":30,\"role\":\"Wife\"},{\"age\":20,\"role\":\"Daughter\"}]"

        val familyType  = object : TypeToken<ArrayList<FamilyMember>>(){}.type
        //val employee :Employee = gson.fromJson(json,::class.java)
        val family : ArrayList<FamilyMember> = gson.fromJson(json,familyType)
        */

    val tut = Employee("Pratyush",20,"p@gmail.com", Address("Varanasi","India"), arrayListOf(
        FamilyMember("Daddy",50),
        FamilyMember("Mummy",45)
    ))

        val json : String = gson.toJson(tut)
        val jsonPreety : String = gsonPreety.toJson(tut)

    }
    }
