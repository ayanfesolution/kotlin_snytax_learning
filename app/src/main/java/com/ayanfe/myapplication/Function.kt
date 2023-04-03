package com.ayanfe.myapplication

fun main(args: Array<String>) {
    print("Please enter the first number: ")
    var firstNum : Int = readLine()!!.toInt()

    print("Please enter the second number: ")
    var secondNum : Int = readLine()!!.toInt()

    show(firstNum, secondNum)

    var a : Int = add(firstNum, secondNum)
    println("Sum of first and second number is $a")

    var b: Int = minus(secondNum , firstNum)
    println("Subtraction of first and second number is $b")

   var c: Int = findTheMinValue(firstNum, secondNum)

    println("The minimum value is $c")
}

fun show(num1:Int, num2:Int) {
    println("You have entered $num1 and $num2")
}

fun add(num1:Int, num2:Int) : Int {
    var sum: Int = 0

     sum = num1 + num2

    return  sum
}

fun minus(num1: Int, num2: Int) : Int {
    var min: Int = 0

    min = num2 - num1

    return  min
}

fun findTheMinValue(num1: Int, num2: Int) : Int {
    var  minimumValue: Int

    if (num1 > num2) {
        minimumValue = num2
    } else {
        minimumValue = num1
    }

    return minimumValue
}