package com.example.firstkotlinproject

fun main() {

    for(i in 0..10000){
        if(i == 9001){
            print("IT'S OVER 9000!!!")
        }
    }

    var humidityLevel = 80
    var humidity = "humid"
    while(humidity == "humid") {
        humidityLevel--
        println("humidity decreased")
        if (humidityLevel < 60) {
            println("it's comfy")
            humidity = "comfy"
        }
    }



}
