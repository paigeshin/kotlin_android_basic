package com.example.firstkotlinproject

import java.lang.IllegalArgumentException

fun main() {
//    var person: Person = Person()
    var paige: Person = Person("Paige", "Shin")
    var hyunhee: Person = Person(firstName = "Hyunhee", lastName = "Lee")

//    var car = Car()
//    car.owner = ""


}

//생성자에서 들어온 parameter 값들은 init()에서만 사용 가능하다.
//만약에 init() 외부에서 쓰고 싶다면 member variables와 binding을 해주어야 한다.
class Person constructor(firstName: String = "John", lastName: String = "Doe") {

    // Member Variables - Properties
    var age: Int? = null
    var hobby: String = "watch Netflix"
    var firstName: String? = null


    // Initializer Block
    init {
        this.firstName = firstName
        println("Initialized a new Person object with ")
        println("firstName = $firstName and lastName = $lastName")
    }

    // Second Constructor
    // explanation about `this` keyword on constructor, firstName, secondName should be the one from the primary constructor
    constructor(firstName: String, lastName: String, age: Int):this(firstName, lastName) {
        this.age = age
        println("Initialized a new Person object with ")
        println("firstName = $firstName and lastName = $lastName and age = $age")
    }

    // Member functions
    fun stateHobby(){
        print("$firstName\'s hobby is $hobby")
        println("My hobby is $hobby")
    }


}

//get, set is automatically generated.

}