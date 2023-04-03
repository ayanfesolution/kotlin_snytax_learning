package com.ayanfe.myapplication

fun main(args: Array<String>) {
    var a: String = "Hello Ayanfe"

    println(a)

    var b: String = ", How are you doing"

    println(a + b)

    var age: Int = 29

    println("Your age is " + age + " " + a)

    var lastName = "Ayanfe"

    var lenghtOfLastName = lastName.length

    println("Lenght of last name  is " + lenghtOfLastName)

    var firstName: String = "Afolabi"

    var isItEqual: Boolean = firstName.equals(lastName)

    println(isItEqual)

    println(firstName.isNotEmpty())

    println(lastName.plus(" ".plus(firstName)))

    println(lastName.uppercase())

    println(firstName.lowercase())

    var doings: String = "  Lets rejoice   "

    println(lastName + " " + firstName + doings)
    var trimedData: String = lastName + " " + firstName + doings
    println(lastName + " " + firstName + doings.trim())
}