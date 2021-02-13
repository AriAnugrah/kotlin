package com.enigma.kotlinbasic

fun main() {
    val animal  = Animal()

    animal.name = "Gemoy"
    animal.type = "Cat"
    animal.age  = 2

    println(animal.name)
    println(animal.type)
    println(animal.age)

    println(animal)
}

data class Animal (
    var name : String = "",
    var type : String = "",
    var age  : Int    = 0
)