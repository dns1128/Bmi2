package com.dns.bmi2

class Person (val name:String,val weight:Float,val height:Float){
    //property屬性
    fun  bmi():Float{
        val bmi = weight/(height*height)
        return bmi
    }
    fun hello(){
        println("hello")
    }
}