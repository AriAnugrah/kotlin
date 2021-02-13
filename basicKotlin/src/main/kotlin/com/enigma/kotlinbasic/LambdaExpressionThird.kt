package com.enigma.kotlinbasic

import java.lang.StringBuilder

fun buildStringwithTag(action: (StringBuilder) -> Unit): String {
    val builder = StringBuilder()
    action(builder)
    return builder.toString()
}

fun main() {
    val word = "Hello world"
    test(word, "div")
}

fun test(word: String, tag: String) {
    val wordWithTagIt = buildStringwithTag {
        it.append("<$tag>")
        it.append(word)
        it.append("</$tag>")
    }
}

//bikin suatu fungsi lambda bisa ganjil dan genap using lambda
//fun IntArray.genap() {
//    for (i in this) {
//        if (i % 2 == 0) {
//            println("${i.toDouble()}")
//        }
//    }
//}


