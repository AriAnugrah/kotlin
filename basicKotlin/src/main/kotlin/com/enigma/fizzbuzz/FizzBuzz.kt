package com.enigma.fizzbuzz

typealias numbersFilter = (Int) -> Boolean
fun main() {
    filterNumbers()
}
fun filterNumbers() {
    try {
        print("Input Array : ")
        val inputs : String = readLine().toString()
        val numbers : IntArray = inputs.split("[\\s,]+".toRegex())?.map { it.toInt() }?.toIntArray()
        println(numbers.joinToString(","))
        println("Your Input has been saved")
        var isContinue = true
        while (isContinue) {
            println("""---Filter Options---""")
            println("1. Find Odd & Even Numbers")
            println("2. Find Prime Number")
            println("3. FizzBuzz Filter")
            println("4. Exit")
            print("Masukkan pilihan : ")
            val choice: Int = readLine()?.toIntOrNull() ?: 0
            when (choice) {
                1 -> {
                    numbers.oddevenNumbers({ it % 2 == 0 })
                    numbers.oddevenNumbers({ it % 2 == 1 })
                }
                2 -> { primeNumber(numbers) }
                3 -> { numbers.fizzbuzzNumbers( { println(it)}) }
                4 -> { isContinue = false }
                else -> { println("Choose between 1 - 4") }
            }
        }
    } catch (e: Exception) {
        println("Your Input must be Integer")
    }
}
fun IntArray.oddevenNumbers(fn: numbersFilter) {
    val result = ArrayList<Int>()
    for (i in this) if (fn(i)) result.add(i)
    println(result)
}
var primeNumber: (IntArray) -> Unit = {
    val result = ArrayList<Int>()
    var prime : Int
    for (i in it) {
        prime = 0
        for (j in 1..i){
            if (i%j == 0) {
                prime += 1
            }
        }
        if (prime == 2){
            result.add(i)
        }
    }
    println(result)
}
fun IntArray.fizzbuzzNumbers(fn: (String) -> Unit) {
    for (i in this) {
        if(i % 3 == 0 && i % 5 == 0) {
            fn("FizzBuzz")
        } else if (i % 3 == 0) {
            fn("Fizz")
        } else if (i % 5 == 0) {
            fn("Buzz")
        } else {
            fn(i.toString())
        }
    }
}
//        print("Input Array Size: ")
//        val total : Int = readLine()?.toInt() ?: 0
//        var numbers : ArrayList<Int> = arrayListOf()
//        for (inputs in 1..total)  {
//
//            print("Input Number Index -$inputs : ")
//            var long : Int = readLine()?.toInt() ?: 0
//            numbers.add(long)
//        }