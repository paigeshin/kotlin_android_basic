package com.example.firstkotlinproject

fun main() {

    whenExpression()

}

fun variableInString() {

    var num = 5
    num += 3
    num++
    println("myNum is $num")
    println("myNum is ${num++}")
    println("myNum is ${++num}")
    println("myNum is ${5 + 3}")

}



//When Expressions, replacement of switch statement
fun whenExpression(){

    val season = 3
    when(season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> { //More than two statements
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    val month = 3
    when(month) {
        in 3..5 -> println("Spring")
        in 5..8 -> println("Summer")
        in 9..11 -> {
            println("Fall")
            println("Autumn")
        }
        12, 1, 2 -> println("Winter")
    }

    val secondMonth = 3
    when(secondMonth) {
        in 5 downTo 3 -> println("Spring")
        in 8 downTo 5 -> println("Summer")
        in 11 downTo 11 -> {
            println("Fall")
            println("Autumn")
        }
        2, 1, 12 -> println("Winter")
        else -> println("Invalid Season")
    }

}

fun ifStatementToWhenStatement(age: Int) {

    if(age >= 21) {
        println("Now you may drink in the US")
    } else if(age >= 18) {
        println("You may vote now")
    } else if(age >= 16) {
        println("You may drive now")
    } else {
        println("You're too young")
    }


    when(age) {
//        in 21..150 -> println("Now you may drink in the US")
        !in 0..20 -> println("Now you may drink in the US")
        in 20 downTo 18 -> println("You may vote now")
        16, 17 -> println("You may drive now")
        else ->  println("You're too young")
    }

}


//Special Object, data type comparison with `is`
fun anyTypeWithWhenStatement() {

    val x: Any = 13.37
    when(x) {
        !is Int -> println("$x is not an Int")
        is Double -> println("$x is a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }

}

