package com.dns.bmi2

class Hello {

}
//kotlin main方法可不用寫在class裡面，java要寫在class內
fun main() {
   val p = Person("jack",65.5f,1.7f)
   val hank = Person("hank",66.5f,1.75f)
   println(p.name+" "+p.name)
   println(hank.name+" "+hank.bmi())
    p.hello()
    println(p.bmi())
    //Bmi
    val w = 65.5f
    val h =1.7f
    val bmi =w/(h*h)
    println("Bmi:"+bmi)

    /*println("Hello Kotlin!")
//可變變數var 不可變變數val
    val age = 20
    //Byte,Short,Int,Long
    val population = 9999L//除了Long用大寫其餘小寫
    println(age.inc())
    println(age)
    var name = "kage"
    println(name.get(1))
    name = "hank"
    println(name)
    val weight:Float=66.5f
    //val weight:Float=66.5.toFloat()
    val c ='a'
    println(c)
    //Float(32位元),Double(64位元)
    //val weight = 65.5f
    //ture,false
    val isAdult = false
    //Char
    val b ='A'*/
}