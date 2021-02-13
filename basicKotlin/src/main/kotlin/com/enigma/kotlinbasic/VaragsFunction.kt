package com.enigma.kotlinbasic

fun main() {
    exampleVargs(1, 2, 3, 4, name = "test")

//    tambah(0,1) standar parameter, posisi argument harus sesuai
//    tambah(num2 = 0, num1 = 1) //named argument
}

fun exampleVargs(vararg number: Int, name: String) { //vararg function
    var total: Int = 0
    for (n in number) {
        total += n
    }
    println("value $name = $total")
}

//fun tambah(num1: Int, num2: Int) {
//
//}