package com.ayanfe.myapplication

class Motorcycle : Vehicle() {



    override  fun  start() {
        println("Motorcycle has started.")
    }

    override  fun  accelerate(speed: Int) {
        println("Motorcycle has accelerate as $speed.")
    }

    override fun  stop() {
        println("Motorcycle has stop.")
    }
}