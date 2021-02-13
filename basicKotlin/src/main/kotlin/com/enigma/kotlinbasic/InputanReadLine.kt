package com.enigma.kotlinbasic

fun main() {

//    val menu : String? = readLine().toString()
//
//    print("MENU : ")
//    print("1. masuk menu 1")
//    print
//    val nama : String? = readLine().toString()
//    print("masukan umur = ")
//    val umur : Int = readLine()?.toInt() ?: 0
//
//    println("nama anda $nama")
//    println("umur anda $umur")


    while (true) {
        try {
            println("Masukan Pilihan")
            println("Menu")
            println("1. masuk menu 1")
            println("2. masuk menu 2")
            var operasiPilihan: String? = readLine().toString()

            when (operasiPilihan) {
                "1" -> satu()
                "2" -> dua()
                else -> break;
            }
        } catch (e: NumberFormatException) {
            println("menu tidak ada")
        }
    }
}

fun satu() {

    println("menu1")
}

fun dua() {

    println("menu2")
}


