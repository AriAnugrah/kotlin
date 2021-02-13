//package com.enigma.kotlinbasic
//
//fun main() {
//
//    while (true) {
//        try {
//            println("################")
//            println("Menu")
//            println("1. Tambah")
//            println("2. Kurang")
//            println("3. Bagi")
//            println("4. Kali")
//            println("5. Exit")
//            println("your choice..")
//            val operasiPilihan: Double = readLine()?.toDouble() ?: 0.0
//            if (operasiPilihan == 5.0) {
//                println("exit program..")
//                break
//            } else {
//                print("Insert first number  = ")
//                val number1: Double = readLine()?.toDouble() ?: 0.0
//                print("Insert second number = ")
//                val number2: Double = readLine()?.toDouble() ?: 0.0
//
//                when (operasiPilihan) {
//                    1.0 -> tambah(number1, number2)
//                    2.0 -> kurang(number1, number2)
//                    3.0 -> bagi(number1, number2)
//                    4.0 -> kali(number1, number2)
//                    5.0 -> {System.exit(0)}
//                    else -> {
//                        println("Wrong input please try again")
//                    }
//                }
//
//                println("count again?")
//                println("1.Yes")
//                println("2.No")
//
//                val pilih: Int = readLine()?.toInt() ?: 0
//
//                if (pilih == 1) {
//                    continue
//                } else if (pilih == 2) {
//                    break
//                } else {
//                    print("Wrong input, please try again")
//                    continue
//                }
//
//            }
//        } catch (e: NumberFormatException) {
//            println("Wrong input, please try again")
//        }
//    }
//
//}
//
//fun tambah(x: Double, y: Double) {
//    val z = x + y
//    println("Added Result : $z")
//}
//
//fun kurang(x: Double, y: Double) {
//    val z = x - y
//    println("Substraction Result : $z")
//}
//
//fun bagi(x: Double, y: Double) {
//    val z = x / y
//    println("Division Result :  $z")
//}
//
////    var average = number.average()
////    var realAverage = String.format("%,.2f" ,average)
////    println("array average =  $realAverage")
//
//fun kali(x: Double, y: Double) {
//    val z = x * y
//    println("Multiple Result : $z")
//}
//
//
