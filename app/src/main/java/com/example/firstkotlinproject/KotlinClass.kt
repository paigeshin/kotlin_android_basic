package com.example.firstkotlinproject

fun main() {
//    var person: Person = Person()
    var paige: Person = Person("Paige", "Shin")
    var hyunhee: Person = Person(firstName = "Hyunhee", lastName = "Lee")
}

class Person constructor(firstName: String = "John", lastName: String = "Doe") {

    // Initializer Block
    init {
        println("Initialized a new Person object with ")
        println("firstName = $firstName and lastName = $lastName")
    }

}