package com.enigma.kotlinbasic

fun main() {
    println("masukan angka di batasi dengan comma contoh 1,2,3")
    var A: Array<Int> = readInts()

    //even(A).forEach(::println)
    fizzBuzz(A)
}

fun readInts(separator: Char = ',') = readLine()!!.split(separator).map(String::toInt).toTypedArray()

var even: (Array<Int>) -> Array<Int> = {
    var result = arrayOf<Int>()
    for (number in it) {
        if (number % 2 == 0) {
            result += number
        }
    }
    result
}

var odd: (Array<Int>) -> Array<Int> = {
    var result = arrayOf<Int>()
    for (number in it) {
        if (number % 2 != 0) {
            result += number
        }
    }
    result
}

var fizzBuzz: (Array<Int>) -> Unit = {
    for (number in it) {
        if (number % 5 == 0 && number % 3 == 0) {
            println("$number is FizzBuzz")
        }
        else if (number % 3 == 0) {
            println("$number is Fizz")
        }
        else if (number % 5 == 0) {
            println("$number is Buzz")
        }
    }
}