package com.ayanfe.myapplication

fun main(args: Array<String>) {
    var number1: Double = 8.4
    var number2: Double = 4.2
    var results: Double = 0.0


    results = number1 + number2
    println("number1 + number2 = ${results}")

    results = number1 - number2
    println("number1 - number2 = ${results}")

    results = number1 * number2
    println("number1 * number2 = ${results}")

    results = number1 % number2
    println("number1 % number2 = ${results}")

    results = number1 / number2
    println("number1 / number2 = ${results}")


    results += number1
    println(" ${results}")


    results -= number1
    println(" ${results}")


    results += number1
    println(" ${results}")


    results *= number1
    println(" ${results}")


    results /= number1
    println(" ${results}")


    results %= number1
    println(" ${results}")


    var myCharRange = 'a'.rangeTo('k')

    var myChar = myCharRange.contains('e')

    println(myChar)

}