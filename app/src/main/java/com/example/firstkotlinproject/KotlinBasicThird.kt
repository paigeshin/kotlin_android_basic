package com.example.firstkotlinproject

fun main(){
    var condition = true
    // Loops
    // While Loop
    // While loop executes a block of code repeatedly as long as a given condition is true
    while(condition) {
        // code to be executed
    }

    var y = 1
    while(y <= 10) {
        println("$y ")
        y++
    }

    // Do while loop
    // The do-while loop is similar to while loop except that it
    // tests the condition at the end of the loop.
    // This means that it will at least execute the body once
    var z = 1
    do {
        print("$z ")
        z++
    } while(z <= 10)

    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold"){
        roomTemp++
        if(roomTemp == 20){
            feltTemp = "comfy"
            println("it's comfy now")
        }
    }


    // For Loop
    // A for-loop is used to iterate through ranges, arrays, collections, or anything
    // that provides an iterator (You’ll learn about iterator, arrays, ranges and collections in a future lectur    e).
    for(num in 1..10) {
        print("$num ")
    }

    // infix notation
    for(i in 1 until 10) { // Same as - for(i in 1.until(10))
        print("$i ")
    }

    for(i in 10 downTo 1) {     // Same as - for(i in 10.downTo(1))
        print("$i ")
    }

    for(i in 1 until 10 step 2) { // Same as - for(i in 1.until(10).step(2))
        print("$i ")
    }
}

fun whileStatement() {
    //While loop executes a block of code repeatdely as long as a given statement is true
    var x = 1
    while(x <= 10) {
        println("$x")
        x++
    }

}

fun doWhileStatement() {
    //Code is executed at least once
    var x = 15
    do {
        println("$x")
        x++
    } while (x <= 10)

    var feltTemp = "cold"
    var roomTemp = 10
    while(feltTemp == "cold") {
        roomTemp++
        if(roomTemp >= 20) {
            feltTemp = "comfy"
            println("It's comfy now")
        }
    }

}

fun forLoop() {

    // 1 ~ 10
    for(num in 1..10){
        print("$num")
    }

    println()

    //1 ~ 9
    for(i in 1 until 10) {
        print("$i")
    }

    println()

    //10 ~ 1
    for(i in 10 downTo 1) {
        print(i)
    }

    println()

    //2, 4, 6, 8, 10
    for(i in 1..10 step 2) {
        print(i)
    }

    println()

    //10, 8, 6, 4, 2
    for(i in 10 downTo  1 step 2) {
        print("$i")
    }

    println()

    //10, 8, 6, 4, 2
    for(i in 10.downTo(1).step(2)) {
        print("$i")
    }

}

