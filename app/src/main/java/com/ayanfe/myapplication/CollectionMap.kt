package com.ayanfe.myapplication

fun main(args: Array<String>) {

    var immutageMapAge = mapOf<String, Int>("Afolabi" to 29, "Wumi" to 26, "Bola" to 24)



    println("Age of Afolabi is ${immutageMapAge["Afolabi"]}")
    println("Age of Wumi is ${immutageMapAge["Wumi"]}")
    println("Age of Bola is ${immutageMapAge["Bola"]}")

    var mutageMapAge = mutableMapOf<String, Int>("Afolabi" to 29, "Wumi" to 26, "Bola" to 24)


    mutageMapAge.put("Bimbo", 18)
    println("Age of Afolabi is ${mutageMapAge["Afolabi"]}")
    println("Age of Wumi is ${mutageMapAge["Wumi"]}")
    println("Age of Bola is ${mutageMapAge["Bola"]}")
    println("Age of Bimbo is ${mutageMapAge.get("Bimbo")}")
}