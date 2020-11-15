# kotling_android_basic

# Basic Event Listener Application 

```kotlin
package com.example.firstkotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        val btn_click_me = findViewById(R.id.button) as Button
        val myTextView = findViewById(R.id.textView) as TextView
        var timesClicked = 0

        // set on-click listener
        btn_click_me.setOnClickListener {
            timesClicked = timesClicked + 1
            myTextView.text = timesClicked.toString()
            Toast.makeText(this@MainActivity, "You clicked Me", Toast.LENGTH_SHORT).show()

        }

    }
}
```


# Variables & DataType

### variables

- val, immutable variable 
- var, mutable variable

### datatype

- byte, short, Int, Long
- char, String 

char can be represented with single quotation mark. `'a'`

String can be represented with double quotation mark, `"abc"`

# Variables in string

```kotlin

fun variableInString() {

    var num = 5
    num += 3
    num++
    println("myNum is $num")
    println("myNum is ${num++}")
    println("myNum is ${++num}")
    println("myNum is ${5 + 3}")

}

```

# Conditional Statement


```kotlin
package com.example.firstkotlinproject

fun main() {

			// Control Flows
	    // If Statements
	    var age = 17
	    if(age >= 21){
	        print("now you may drink in the US")
	    }
	    // Else If Statement - only executed if the if statement is not true
	    else if(age >= 18){
	        print("now you may vote")
	    }
	    // Else If Statement - only executed if the foregoing else if statement is not true
	    else if (age >= 16){
	        print("you now may drive")
	    }
	    // else is only executed if all of the foregoing statements weren't true
	    else{
	        print("you're too young")
	    }
	 
	    // Kotlin’s "when" expression is the replacement of the switch statement
	    // from other languages like C, C++, and Java.
	    // It is compact and more powerful than switch statements.
	    var season = 3
	    when(season) {
	        1 -> println("Spring")
	        2 -> println("Summer")
	        3 -> println("Fall")
	        4 -> println("Winter")
	        else -> println("Invalid Season")
	    }
	    var month = 3
	    when(month) {
	        1,2,3 -> println("Spring")
	        in 4..6 -> println("Summer")
	        in 7..9 -> println("Fall")
	        in 10..12 -> println("Winter")
	        else -> println("Invalid Season")
	    }
	 
	    // challenge - translate the if statement with the age to a when expression
	    when(age){
	        // with the !in it's the same as saying not in ...
	        !in 0..20  -> print("now you may drink in the US")
	        in 18..20  -> print("now you may vote")
	        16,17 -> print("you now may drive")
	        else -> print("you're too young")
	    }
	 
	    var x : Any = 13.37
	    when(x) {
	        is Int -> println("$x is an Int")
	        !is Double -> println("$x is not Double")
	        is String -> println("$x is a String")
	        else -> println("$x is none of the above")
	    }

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
```

**What will this code print out?**

```kotlin
fun main() {
    var age = 25
    if (age > 17){
        println("you may vote")
    }else if(age > 20){
        println("you may drink")
    }else{
        println("don't drink and vote ;)")
    }
}
```

⇒ Exactly, only you may vote will be printed because once the first condition that is met was executed the code jumps out of the whole block. else if(age > 20) will never be triggered


# Loop


```kotlin
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
```

# Function

```kotlin
package com.example.firstkotlinproject

fun main() {

}

fun myFunction() {
    print("Called from myFunction")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun avg(a: Double, b: Double): Double {
    return (a + b) / 2
}
```

# Nullable

```kotlin
package com.example.firstkotlinproject

fun main() {

}

fun nullable() {
    var name: String = "Denis"
    //name = null -> Compilation ERROR

    var nullableName: String? = "Denis"

    var len = name.length
    val len2 = nullableName?.length //if nullable name is null, print 'null' instead of nullableName.length

    /*
        if(nullableName != null) {
            var len2 = nullableName.length
        } else {
            null
        }
     */

//    nullableName = null

    //Give Default Value to `Nullable` Value.
    val newName = nullableName ?: "Guest"
    print("Name is $newName")

    //Forcing nullable value
    println("${nullableName!!.toLowerCase()}") //compile error if value is null

    val length = nullableName?.let {
        println("nullalble.let")
        println(it.length)
        it.length
    }
    print(length)

}
```

### Forcing Nullable Value

- Swift

```swift
var name: String? = "Hello World"
print(name!.count)
```

- Kotlin

```kotlin
var name: String? = "Hello World"
print(name!!.length)
```

### Set Default Value

- Swift

```swift
var name: String? = "Hello World"
print(name ?? "Hello")
```

- Kotlin

```swift
var name: String? = "Hello World"
print(name ?: "Hello") 
```

### Execution & Save

- Swift

```swift
let name: String? = "Hello World"
guard let name: String = name else {
	print("")
	print("")
	return
}
```

- Kotlin

```kotlin
var name: String? = "Hello World"
val length = name?.let {
		println()
    println()
    it.length
}
```