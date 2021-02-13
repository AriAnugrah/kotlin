package com.enigma.kotlinbasic

fun main() {
    fun hello(name: String): String {
        return if (name == "") {
            "hello bro"
        } else {
            "Hello $name"
        }
    }

    print(hello( ""))
}