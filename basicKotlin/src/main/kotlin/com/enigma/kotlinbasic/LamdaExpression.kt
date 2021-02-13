package com.enigma.kotlinbasic

typealias kalkulatorFn = (Int, Int) -> Int

fun main() {

    noLambdaParam {
        println("Doni")
    }


//    val sum: (Int, Int) -> Int = { num1, num2 ->
//        num1 + num2
//    }
//
//    val sub: (Int, Int) -> Int = { num1, num2 ->
//        num1 - num2
//    }
//
//    val mul: (Int, Int) -> Int = { num1, num2 ->
//        num1 * num2
//    }
//
//    val div: (Int, Int) -> Int = { num1, num2 ->
//        num1 / num2
//    }
//
//    println(sum(2, 3))

    val penjumlahan = kalkulator(1, 2) { i, j -> i + j }
    println(penjumlahan)

    val pengurangan = kalkulator(1, 2) { i, j ->
        i - j
    }

    cetak(pengurangan) {
        println(it)
    }
}

fun kalkulator(num1: Int, num2: Int, fn: kalkulatorFn): Int {
    return fn(num1, num2)
}

fun cetak(hasil: Int, fn: (String) -> Unit) {
    fn(hasil.toString())
}

fun noLambdaParam(fn: () -> Unit) {
    fn()
}


