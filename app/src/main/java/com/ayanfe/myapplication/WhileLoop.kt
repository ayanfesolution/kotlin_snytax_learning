package com.ayanfe.myapplication

import kotlin.random.Random

fun main(args: Array<String>) {

    var i = 0

    while ( i < 5) {
        println(i)
        ++i
    }
    print("Guess a number: ")
    var number = Random.nextInt(0 , 100)

    while (true) {
        var  userGuess: Int = readLine()!!.toInt()

        if (userGuess == number ) {
            println("Congratulation, you know the number in my mind")
            break
        } else if (userGuess < number) {
            println("Increase your guess")
        } else {
            println("Decrease your guess")
        }
    }

    do {
        println(number)
        number++
    } while (number < 80)
}