package com.ayanfe.myapplication

fun main(args: Array<String>) {
    print("Please enter a particuler number : ")

    var num: Int = readLine()!!.toInt()

    if (num % 2 == 0) {
        println("The number $num you entered is an Even number")
    } else {
        println("The number $num you entered is an Old number")
    }


    print("Please enter your age : ")

    var age: Int = readLine()!!.toInt()

    if (age < 13) {
        println("You are a child")
    } else if (age < 19){
        println("You are a teenager")
    } else {
        if (age > 19) {
            if (age == 20) {
                println("You are just a a youth")
            } else {
                println("You are a big man now")
            }
        }
    }



    var day: Int = readLine()!!.toInt()


    var dayName: String

    when (day) {
        1 -> dayName = "Monday"
        2 -> dayName = "Tuesday"
        3 -> dayName = "Wednesday"
        4 -> dayName = "Thursday"
        5 -> dayName = "Friday"
        6 -> dayName = "Saturday"
        7 -> dayName = "Sunday"
        else -> dayName = "Invalid day entered"
    }
    println("The day is $dayName")

}