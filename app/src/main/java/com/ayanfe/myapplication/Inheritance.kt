package com.ayanfe.myapplication

fun main(args: Array<String>) {

    var car = Car()
    car.type = "Car"
    car.model = "Ferrarri"
    car.maxSpeed = 50
    car.show()
    car.start()
    car.accelerate(100)
    car.stop()

    var motorcycle = Motorcycle()
    motorcycle.type = "Motorcycle"
    motorcycle.model = "Power Bike"
    motorcycle.maxSpeed = 300
    motorcycle.show()
    motorcycle.start()
    motorcycle.accelerate(360)
    motorcycle.stop()
}