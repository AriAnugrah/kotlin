package com.enigma.kotlinbasic

import java.lang.StringBuilder

fun main() {
//    val name : String = "arif"
//    println(name.hello())
    val word = "Hello World"
    println(word)

    val wordTag1 = appendTagV1(word, "div")
    println(wordTag1)

    val wordTag2 = appendTagV2(word, "div")
    println(wordTag2)

    val wordTag3 = word.appendTag("div").appendTag("p")
    println(wordTag3)
}

//fun String.hello(): String {
//    return "Hello $this"
//}

fun appendTagV1(word: String, tag : String):String{
    return StringBuilder().append("<$tag>").append(word).append("</${tag}>").toString()
}

fun appendTagV2(word : String, tag : String ) = "<${tag}>${word}</${tag}>"

fun String.appendTag(tag: String) = StringBuilder().append("<${tag}>").append(this).append("</${tag}>").toString()
