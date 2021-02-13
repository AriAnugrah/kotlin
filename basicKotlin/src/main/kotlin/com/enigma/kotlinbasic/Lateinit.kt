package com.enigma.kotlinbasic

class Television {
    lateinit var brand: String

    fun innitTelevision(brand: String) {
        this.brand = brand
    }
}

fun main(){
    val tv1 = Television()

    tv1.innitTelevision("LG")
    println(tv1.brand)


}