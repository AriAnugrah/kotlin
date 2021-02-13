package com.enigma.kotlinbasic
//
//open class Employee(val name: String){
//    fun sayHello(name: String){
//        println("Hello $name, my name is ${this.name}")
//
//    }
//
//}
//
//class Manager(name : String): Employee(name)
//class VicePresident(name : String): Employee(name)
//
//fun main(){
//    val jution = Manager("Jution")
//    jution.sayHello("Arif")
//
//    val doni = VicePresident("doni")
//    doni.sayHello("arif")
//}

//########################################################
open class Employee(val name: String){
    open fun sayHello(name: String){
        println("Hello $name, my name is ${this.name}")

    }

}

class Manager(name: String): Employee(name){
    override fun sayHello(name: String){
        println("Hello $name, my name is manager ${this.name}")
    }
}

fun main(){
    val jution = Manager("Jution")
    jution.sayHello("arif")
}