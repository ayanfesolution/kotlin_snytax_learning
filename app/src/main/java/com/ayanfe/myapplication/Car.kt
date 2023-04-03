package com.ayanfe.myapplication

class Car : Vehicle() {


    override  fun  start() {
        println("Car has started.")
    }

    override  fun  accelerate(speed: Int) {
        println("Car has accelerate as $speed.")
    }

    override fun  stop() {
        println("Car has stop.")
    }
}