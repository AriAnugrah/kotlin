package com.enigma.kotlinbasic

val x: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

fun main() {
    x.genap()
    x.ganjil()
}

fun IntArray.genap() {
    for (i in this) {
        if (i % 2 == 0) {
            println("${i.toDouble()}")
        }
    }
}

fun IntArray.ganjil() {
    for (i in this) {
        if (i % 2 != 0) {
            println("$i")
        }
    }
}




