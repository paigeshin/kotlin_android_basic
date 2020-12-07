package com.example.firstkotlinproject

/*

- An abstract class cannot be instantiated
- You cannot create objects of an abstract class
- However, you can inherit subclasses from an abstract class
- The members (properties and methods) of an abstract class are non-abstract
- Unless you explicitly use the abstract keyword to make them abstract

*/

abstract class Mammal(private val name: String,  private val origin: String, private val weight: Double) {

    // Abstract Property (Must be overriden by Subclasses)
    abstract var maxSpeed: Double

    // Abstract Methods (Must be implemented by Subclasses)
    abstract fun run()
    abstract fun breath()

    // Concrete (Non Abstract) Method
    fun displayDetails() {
        println("Name: $name, Origin: $origin, Weight: $weight, Max Speed: $maxSpeed")
    }

}

class Human(name: String, origin: String, weight: Double, override var maxSpeed: Double): Mammal(name, origin, weight) {

    override fun run() {

    }

    override fun breath() {

    }

}