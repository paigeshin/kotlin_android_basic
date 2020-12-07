package com.example.firstkotlinproject

/*
The class that inherits the features of another
class is called the Sub class or Child class or
Derived class, and the class whose features are
inherited is called the Super class or Parent class
or Base class
 */

interface Drivable {
    var maxSpeed: Double
    fun drive(): String //undefined function
    fun brake() { //defined function
        println("The drivable is breaking")
    }
}

//open class which allows inheritance
open class Vehicle {
    // properties
    // methods
}


// not inheritable class
sealed class HelloCar {

}

//sub class of vehicle
//super class, parent class, base class of vehicle
open class Car(override var maxSpeed: Double, val name: String, val brand: String): Vehicle(), Drivable {
    open var range: Double = 0.0

    fun extendRange(amount: Double) {
        if(amount > 0)
            range += amount
    }

    open fun drive(distance: Double) {
        println("Drove for $distance KM")
    }

    // override fun drive(): String = "driving the interface drive"
    override fun drive(): String {
        return "driving the interface drive"
    }

}


// sub class  child class or derived class of Car
class ElectricCar(maxSpeed: Double, name: String, brand: String, batteryLife: Double):  Car(maxSpeed, name, brand) {

    var chargerType: String = "Type1"
    override var range: Double = batteryLife * 6

    override fun drive(distance: Double) {
        println("Drove for $distance KM on electricity")
    }

    override fun drive(): String {
        return "Drove for  $range KM on electricity"
    }

    override fun brake() {
        super.brake()

    }

}