package com.example.firstkotlinproject

//data class must have at least one parameter
data class User(val id: Long, val name: String)

fun main() {
    val user = User(id = 1, name = "denis")
    val updatedUser = user.copy(name = "Denis Panjuta")
    print(updatedUser.component1()) // prints 1
    print(updatedUser.component2()) // prints Denis Panjuta
    val (id, name) = updatedUser
    print("id=$id")
    print("name=$name")
}