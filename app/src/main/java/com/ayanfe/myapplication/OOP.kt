package com.ayanfe.myapplication

fun main(args: Array<String>) {

    var firstPerson = Person(name = "Afolabi", age = 29)

    firstPerson.age = 30
    firstPerson.name = "Bola"

    println("The first person name is ${firstPerson.name} and age is ${firstPerson.age}")
}