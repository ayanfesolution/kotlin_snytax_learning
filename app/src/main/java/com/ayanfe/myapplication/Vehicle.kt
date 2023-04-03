package com.ayanfe.myapplication

open class Vehicle {

    var type: String? = null
    var model: String? = null
    var maxSpeed: Int? = null


    fun show() {
        println("Type : $type")
        println("Model : $model")
        println("MaxSpeed : $maxSpeed")
    }

    open  fun  start() {
        println("Vehicle has started.")
    }

    open  fun  accelerate(speed: Int) {
        println("Vehicle has accelerate as $speed.")
    }

    open fun  stop() {
        println("Vehicle has stop.")
    }

}