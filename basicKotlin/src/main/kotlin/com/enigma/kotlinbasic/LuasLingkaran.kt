package com.enigma.kotlinbasic

class Lingkaran(var r: Int) {
    fun luas() {
        println("luas dengan 22/7: ${22 * this.r * this.r / 7}")
    }

    fun luas(phi: Double = 3.14) {
        println("luas dengan 3,14: ${phi * (this.r * this.r)}")
    }
}

fun main() {



    var lingkaran = Lingkaran(7)
    lingkaran.luas(3.14)
    lingkaran.luas()

}