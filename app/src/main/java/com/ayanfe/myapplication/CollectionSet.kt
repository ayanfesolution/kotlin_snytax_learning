package com.ayanfe.myapplication

fun main(args: Array<String>) {

    var myEqualArray = arrayListOf<Any>("Kotlin", 2, 2.5, 'K', true, "Kotlin")

    println(myEqualArray.size)
    println(myEqualArray.last())

    var myEqualSet = setOf<Any>("Kotlin", 2, 2.5, 'K', true, "Kotlin")

    println(myEqualSet.size)
    println(myEqualSet.last())
}