package com.ayanfe.myapplication

fun main(args: Array<String>) {
    var listOfAges = arrayOf(5, 6, 7)

    println("The first element of the array is = " + listOfAges[0])

    println("The first element of the array is = " + listOfAges[1])

    println("The first element of the array is = " + listOfAges[2])

    var listOfCars = arrayOf("BMW", "Mercedes", "age")

    println("The first element of the array is = " + listOfCars[0])

    println("The first element of the array is = " + listOfCars[1])

    println("The first element of the array is = " + listOfCars[2])

    listOfCars.set(2, "Benz")

    println("The first element of the array is = " + listOfCars[0])

    println("The first element of the array is = " + listOfCars[1])

    println("The first element of the array is = " + listOfCars[2])


  //  listOfCars.set(4, "House")

    var listsOfAges = ArrayList<Int>()

    listsOfAges.add(40)



    listsOfAges.remove(10)

    println(listsOfAges)


    var listOfAnyType = ArrayList<Any>()

    listOfAnyType.add(1)

    listOfAnyType.add("Strings")

    listOfAnyType.add(false)

    println(listOfAnyType)
}