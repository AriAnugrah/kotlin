package com.enigma.kotlinbasic

fun main() {

    var hero1 = Hero("Ironman", 25, 200)
    var hero2 = Hero("Captain America", 15, 100)

    println(hero1.attack(hero2))

}

class Test(var firstName: String, var lastName: String) {
}

class Test2(value1: String="+62") {
    var value1 : String = value1
}

class Hero(name: String, damage: Int, hp: Int) {
    var name: String = name
    var damage: Int = damage
    var hp: Int = hp

    fun attack(hero : Hero) : Int {
        hero.hp -= damage
        return hero.hp
    }
}