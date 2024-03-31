package com.dns.bmi2

class Hello {

}
//kotlin main方法可不用寫在class裡面，java要寫在class內
fun main() {
    println("Hello Kotlin!")
//可變變數var 不可變變數val
    val age = 20
    println(age.inc())
    println(age)
    var name = "kage"
    println(name.get(1))
    name = "hank"
    println(name)
}