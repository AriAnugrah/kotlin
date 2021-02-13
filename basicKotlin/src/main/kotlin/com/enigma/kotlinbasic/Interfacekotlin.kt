//package com.enigma.kotlinbasic
//
//interface Engine {
//    fun startEngine()
//}
//
//class ElectricEngine : Engine {
//    override fun startEngine() {
//        println("Engine menyala")
//    }
//}
//
//interface ConcreteFunction {
//    val name: String
//    fun home(address1: String, address2: String)
//    fun hello(name: String) : String {
//    }
//
//}
//
//class ConcreteFunctions(override val name: String) : ConcreteFunction {
//    override fun home(address1: String, address2: String){
//    }
//}
//
//fun main() {
//    val electricEngine = ElectricEngine()
//    electricEngine.startEngine()
//
//}