package com.example.firstkotlinproject

import java.lang.IllegalArgumentException

fun main() {
//    var person: Person = Person()
    var paige: Person = Person("Paige", "Shin")
    var hyunhee: Person = Person(firstName = "Hyunhee", lastName = "Lee")

    var car = Car()
    car.owner = ""


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
class Car() {
    lateinit var owner: String //initialize later on

    val myBrand: String = "BMW"

    get() {
        return field.toLowerCase()
    }

    var maxSpeed: Int = 250

    set(value) {
        field = if(value > 0) value else throw IllegalArgumentException("MaxSpped can't be less than 0")
    }

    //Whenever you create a member variable in class, get, set code is automatically generated.
    /*
        get() = field
        set(value) {
            field = value
        }
     */
    var newValueField: Int =  150
    get() = field
    set(value) {
        field = value
    }

    //private set
    var myModel: String = "M5"
    private set //if you use this keyword, you can't set this value outside of class

    init {
        this.owner = "Frank"
        this.myModel = "M3"
    }

}