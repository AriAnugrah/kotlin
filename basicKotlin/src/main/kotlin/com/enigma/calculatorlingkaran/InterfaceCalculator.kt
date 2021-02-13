package com.enigma.calculatorlingkaran
import java.lang.NumberFormatException
import kotlin.math.pow


interface Kalkulator {
    fun tambah(num1: Double, num2: Double)
    fun kurang(num1: Double, num2: Double)
    fun bagi(num1: Double, num2: Double)
    fun kali(num1: Double, num2: Double)
    fun calculateArea(radius: Double)
    fun calculateAround(radius: Double)
}

class Hitung : Kalkulator {

    override fun tambah(num1: Double, num2: Double) {
        val result = num1 + num2
        println("-------------------------- +")
        print("Hasilnya adalah:      ")
        println(String.format("%.2f", result))
    }

    override fun kurang(num1: Double, num2: Double) {
        val result = num1 - num2
        println("-------------------------- -")
        print("Hasilnya adalah:      ")
        println(String.format("%.2f", result))
    }
    override fun bagi(num1: Double, num2: Double) {
        val result = num1 / num2
        println("-------------------------- :")
        print("Hasilnya adalah:      ")
        println(String.format("%.2f", result))
    }

    override fun kali(num1: Double, num2: Double) {
        val result = num1 * num2
        println("-------------------------- x")
        print("Hasilnya adalah:      ")
        println(String.format("%.2f", result))
    }

    override fun calculateArea(radius: Double) {
        val result1 = 3.14 * radius.pow(2)
        print("Luas Lingkaran dengan radius-radius $radius & phi 3.14 adalah ")
        println(String.format("%.2f", result1))

        val result2 = 22 * radius.pow(2) / 7
        print("Luas Lingkaran dengan radius-radius $radius & phi 22/7 adalah ")
        println(String.format("%.2f", result2))
    }

    override fun calculateAround(radius: Double) {
        val result3 = 3.14 * 2 * radius
        print("Keliling Lingkaran dengan radius-radius $radius & phi 3.14 adalah ")
        println(String.format("%.2f", result3))

        val result4 = 22 * 2 * radius / 7
        print("Keliling Lingkaran dengan radius-radius $radius & phi 22/7 adalah ")
        println(String.format("%.2f", result4))
    }
}

fun main() {

    var loop = true

    while (loop) {
        try {
            println("---Daftar Menu Kalkulator---")
            println("1. Penjumlahan")
            println("2. Pengurangan")
            println("3. Perkalian")
            println("4. Pembagian")
            println("5. Lingkaran")
            println("6. Keluar")

            print("Silahkan pilih daftar menu: ")
            val pilih = readLine()?.toInt() ?: 0

            if (pilih in 1..4) {

                print("Masukkan angka pertama: ")
                val num1 = readLine()!!.toDouble()
                print("Masukkan angka kedua:   ")
                val num2 = readLine()!!.toDouble()

                val cal = Hitung()
                when (pilih) {
                    1 -> cal.tambah(num1, num2)
                    2 -> cal.kurang(num1, num2)
                    3 -> cal.kali(num1, num2)
                    4 -> cal.bagi(num1, num2)
                }

            } else if (pilih == 5) {
                println("1. Luas Lingkaran")
                println("2. Keliling Lingkaran")
                println("3. Keluar")
                print("Silahkan pilih : ")
                val pilih = readLine()?.toInt() ?: 0

                if (pilih in 1..2) {
                    print("Masukkan radius-radius: ")
                    val radius = readLine()!!.toDouble()

                    val cal = Hitung()
                    when (pilih) {
                        1 -> cal.calculateArea(radius)
                        2 -> cal.calculateAround(radius)
                    }

                } else if (pilih == 3) {
                    println("Anda keluar dari program")
                    println("Terimakasih")
                    loop = false
                    break
                } else {
                    println("Maaf, menu tidak tersedia")
                    println("Silahkan coba lagi")
                }

            } else if (pilih == 6) {
                println("Anda keluar dari program")
                println("Terimakasih")
                loop = false
                break
            } else {
                println("Maaf, menu tidak tersedia")
                println("Silahkan coba lagi")
            }

            println("Ulangi?")
            println("1. Ya")
            println("2. Tidak")
            print("Pilih: ")
            val pilihan = readLine()?.toInt() ?: 0

            when (pilihan) {
                1 -> loop = true
                2 -> {
                    println("Anda keluar dari program")
                    println("Terimakasih")
                    loop = false
                }
                else -> {
                    println("Maaf, menu tidak tersedia")
                    println("Silahkan coba lagi")
                }
            }

        } catch (e: NumberFormatException) {
            println("Maaf, mohon masukkan angka")
            println("Silahkan coba lagi")
        }
    }
}

