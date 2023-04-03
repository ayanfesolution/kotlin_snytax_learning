package com.ayanfe.myapplication

fun main(args: Array<String>) {



    var myNumberArray = arrayListOf<Int>(0,1,2,3,4,5,6,7,8,9)

    myNumberArray.forEach {
        println(it)
    }

    println(myNumberArray.indices)

    for (num in myNumberArray) {
        for (y in 0 .. myNumberArray.size - 1) {
            println("my number ${y} is equal to ${myNumberArray[y]}")
        }
    }



    for (num in 0..20) {
        println(num)
        if (num % 2 == 0) {
            println("$num is an Even Number")
        } else  if (num % 2 != 0) {
            println("$num is an Old Number")
        } else {
            println("$num can't be cartigorized")
        }
    }
}