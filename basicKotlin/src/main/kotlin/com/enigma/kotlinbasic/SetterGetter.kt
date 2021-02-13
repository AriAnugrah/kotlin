package com.enigma.kotlinbasic

class Note(title: String) {
    var title: String = title
        get() = field.toUpperCase()
        set(value) {
            if (value.isNotBlank()) {
                field = value
            }
        }
}

fun main() {
    val note = Note("Catatanku")
    note.title = ""
    println(note.title)
}