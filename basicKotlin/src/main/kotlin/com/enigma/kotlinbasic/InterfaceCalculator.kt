package com.enigma.kotlinbasic

import kotlin.math.pow
import kotlin.system.exitProcess

interface CalculatorLingkaran {
    fun tambah(x: Double, y: Double)
    fun kurang(x: Double, y: Double)
    fun bagi(x: Double, y: Double)
    fun kali(x: Double, y: Double)
    fun area(r: Double)
    fun perimeter(r: Double)
}

class CalculatorLingkaranFn : CalculatorLingkaran {

    override fun tambah(x: Double, y: Double) {
        val total: Double = x + y
        println("Hasil Penjumlahan = $total")
    }

    override fun kurang(x: Double, y: Double) {
        val total: Double = x - y
        println("Hasil Pengurangan = $total")
    }

    override fun bagi(x: Double, y: Double) {
        val total: Double = x / y
        println("Hasil Bagi = $total")
    }

    override fun kali(x: Double, y: Double) {
        val total: Double = x * y
        println("Hasil Kali = $total")
    }

    override fun area(r: Double) {
        val phi = 3.14
        val total: Double = phi * r.pow(2)
        println("Hasil Luas = $total")
    }

    override fun perimeter(r: Double) {
        val phi = 3.14
        val total: Double = 2 * phi * r
        println("hasil Keliling = $total")
    }
}


fun main() {
    menuUtama()
}

fun menuUtama() {
    while (true) {
        try {
            println("#############")
            println("Menu")
            println("1.Lingkaran")
            println("2.Calculator")
            println("3.Exit")
            println("your choice...")
            val operasiPilihan: Int = readLine()?.toInt() ?: 0
            if (operasiPilihan == 3) {
                println("Exit program...")
                break
            } else {
                when (operasiPilihan) {
                    1 -> menuLingkaran()
                    2 -> menuCalculator()
                    else -> {
                        println("Wrong input please try again")
                    }
                }
            }
        } catch (e: NumberFormatException) {
            println("Wrong input, please try again")
        }
    }
}

fun menuLingkaran() {
    while (true) {
        try {
            println("#############")
            println("Menu")
            println("1.Luas")
            println("2.Keliling")
            println("3.Exit")
            println("your choice..")
            val operasiPilihan: Int = readLine()?.toInt() ?: 0

            val calculatorLingkaranFn = CalculatorLingkaranFn()
            print("Insert radius = ")
            val r: Double = readLine()?.toDouble() ?: 0.0
            when (operasiPilihan) {
                1 -> calculatorLingkaranFn.area(r)
                2 -> calculatorLingkaranFn.perimeter(r)
                3 -> exitProcess(0)
                else -> {
                    println("Wrong input please try again")
                }
            }
            println("count again?")
            println("1.Yes")
            println("2.No")

            val pilih: Int = readLine()?.toInt() ?: 0

            if (pilih == 1) {
                continue
            } else if (pilih == 2) {
                break
            } else {
                print("Wrong input, please try again")
                continue
            }

        } catch (e: NumberFormatException) {
            println("Wrong input, please try again")
        }
    }
}

fun menuCalculator() {
    while (true) {
        try {
            println("################")
            println("Menu")
            println("1. Tambah")
            println("2. Kurang")
            println("3. Bagi")
            println("4. Kali")
            println("5. Exit")
            println("your choice..")
            val operasiPilihan: Int = readLine()?.toInt() ?: 0
            if (operasiPilihan == 5) {
                println("exit program..")
                exitProcess(0)
            } else {
                print("Insert first number  = ")
                val number1: Double = readLine()?.toDouble() ?: 0.0
                print("Insert second number = ")
                val number2: Double = readLine()?.toDouble() ?: 0.0

                val calculatorLingkaranFn = CalculatorLingkaranFn()
                when (operasiPilihan) {
                    1 -> calculatorLingkaranFn.tambah(number1, number2)
                    2 -> calculatorLingkaranFn.kurang(number1, number2)
                    3 -> calculatorLingkaranFn.bagi(number1, number2)
                    4 -> calculatorLingkaranFn.kali(number1, number2)
                    5 -> {
                        exitProcess(0)
                    }
                    else -> {
                        println("Wrong input please try again")
                    }
                }

                println("count again?")
                println("1.Yes")
                println("2.No")

                val pilih: Int = readLine()?.toInt() ?: 0

                if (pilih == 1) {
                    continue
                } else if (pilih == 2) {
                    break
                } else {
                    print("Wrong input, please try again")
                    continue
                }

            }
        } catch (e: NumberFormatException) {
            println("Wrong input, please try again")
        }
    }
}