package com.enigma.kotlinbasic

fun main(){

    var jam : Double = 10.30

    when(jam) {
        in 1.0..9.0 -> println("selamat pagi")
        in 10.0..15.0 -> println("selamat siang")
        in 15.0..18.0 -> println("selamat sore")
        else -> println("selamat malam")
    }
}

