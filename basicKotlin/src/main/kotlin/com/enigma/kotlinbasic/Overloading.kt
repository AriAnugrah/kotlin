package com.enigma.kotlinbasic

class Customer(var name: String){
    fun buySomething(productName: String, productPrice: Int){
        println("Customer dengan nama ${this.name} memberli barang $productName dengan harga $productPrice")
    }

    fun buySomething(productName: String, productPrice: Int, productQty: Int){
        println("Customer dengan nama ${this.name} memberli barang $productName dengan harga $productPrice dan quantity sebanyak $productQty")
    }
}

fun main(){
    var budi = Customer("budi")
    budi.buySomething("shampo",10_000)
    var egi = Customer("egi")
    egi.buySomething("sabun", 10_000, 2)
}