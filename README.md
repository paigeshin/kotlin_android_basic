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

### Class

```kotlin
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

```kotlin
package com.example.firstkotlinproject

class MobilePhone constructor(osName: String = "Android", brand: String = "Samsung", model: String = "Samsung Galaxy S20 Ultra") {

    init {
        println("model")
        println("Here the osName is Android, brand is $brand, model is $model")
    }

}
``` 


### Class, secondary constructor and binding 

```kotlin

package com.example.firstkotlinproject

fun main() {
//    var person: Person = Person()
    var paige: Person = Person("Paige", "Shin")
    var hyunhee: Person = Person(firstName = "Hyunhee", lastName = "Lee")


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

```

### Secondary Constructor

```kotlin
package com.example.firstkotlinproject

fun main() {
//    var person: Person = Person()
    var paige: Person = Person("Paige", "Shin")
    var hyunhee: Person = Person(firstName = "Hyunhee", lastName = "Lee")

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
```

### Get, Set, lateinit

```kotlin
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
```

### Data class

```kotlin
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
```

### Inheritance

```kotlin
package com.example.firstkotlinproject

/*
The class that inherits the features of another
class is called the Sub class or Child class or
Derived class, and the class whose features are
inherited is called the Super class or Parent class
or Base class
 */

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
open class Car(val name: String, val brand: String): Vehicle() {
    open var range: Double = 0.0

    fun extendRange(amount: Double) {
        if(amount > 0)
            range += amount
    }

    open fun drive(distance: Double) {
        println("Drove for $distance KM")
    }

}

// sub class  child class or derived class of Car
class ElectricCar(name: String, brand: String, batteryLife: Double):  Car(name, brand) {

    var chargerType: String = "Type1"
    override var range: Double = batteryLife * 6

    override fun drive(distance: Double) {
        println("Drove for $distance KM on electricity")
    }

    fun drive() {
        println("Drove for $range KM on electricity")
    }

}
```

### Interface

```kotlin
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
```

### Abstract Class

```kotlin
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
```

### Casting

```kotlin
package com.example.firstkotlinproject

fun main() {

    val stringList: List<String> = listOf("Denis", "Frank", "Micheal", "Garry")
    val mixedTypeList: List<Any> = listOf("Denis", 31, 5, "BDay", 70.5, "weights", "Kg")

    for(value in mixedTypeList) {
        if (value is Int) {
            println("Integer: $value")
        } else if (value is Double) {
            println("Double: $value")
        } else if (value is String) {
            println("String: $value")
        } else {
            println("Unknown Type")
        }
    }

    // Alternately
    for(value in mixedTypeList) {
        when(value) {
            is Int -> println("Integer: $value")
            is Double -> println("Double: $value")
            is String -> println("String: $value")
            else -> println("Unknown Type")
        }
    }

    // SMART CAST
    val obj1: Any = "I have a dream"
    if(obj1 !is String) {
        println("Not a String")
    } else {
        //obj is automatically cast to a String in this scope
        println("Found a String of length ${obj1.length}")
    }

    // Explicit(unsafe) Casting using the "as" keyword - can go wrong
    val str1: String = obj1 as String
    println(str1.length)

    val obj2: Any = 1337
    val str2: String = obj2 as String
    println(str2)

    // Explicit (safe) casting using the "as?" keyword
    val obj3: Any = 1337
    val str3: String? = obj3 as? String // Works
    println(str3)

}
```

```kotlin
fun createArrayListAndCalculate(): Double {

    val arrayList: ArrayList<Double> = ArrayList(5)
    arrayList.add(0.5)
    arrayList.add(0.5)
    arrayList.add(0.5)
    arrayList.add(0.5)
    arrayList.add(0.5)

    var sum: Double = 0.0
    for(element in arrayList) {
        sum += element
    }

    return sum / arrayList.size
}
```

# Why should you use ArrayLists?

- ArrayLists are used to create a dynamic array. Which means the size of an ArrayList can be increased or decreased according to your requirement.
- The ArrayList class provides both **read and write** functionalities.
- The ArrayList follows the **sequence of insertion** order.
- An ArrayList is **non synchronized** and it may contain duplicate elements.

# Constructor of ArrayList

- ArrayList<E>(): Is used to create an empty ArrayList.
- ArrayList(capacity: Int): Is used to create an ArrayList of specified capacity.
- ArrayList(elements: Collection<E>): Is used to create an ArrayList filled with the elements of a collection.

# Functions of ArrayList

- open fun add(element: E): Boolean → used to add the specific element into the collection.
- open fun clear() → used to remove all elements from the collection.
- open fun get(index: Int): E → used to return element at specified index in the list.
- open fun remove(element: E): Boolean → used to remove a single instance of the specific element from current collection, if it is available.
- There are of course many more functions in the ArrayList Class.

# Example of ArrayList

```kotlin
fun createArrayListAndCalculate(): Double {

    val arrayList: ArrayList<Double> = ArrayList(5)
    arrayList.add(0.5)
    arrayList.add(0.5)
    arrayList.add(0.5)
    arrayList.add(0.5)
    arrayList.add(0.5)

    var sum: Double = 0.0
    for(element in arrayList) {
        sum += element
    }

    return sum / arrayList.size
}
```

# Lambda Expressions

- Lambda (Expression) is a function which has no name. (Anonymous function)
- Lambda expressions and anonymous functions are 'function literals', i.e. functions that are not declared, but passed immediately as an expression
- Lambda is defined with curly braces { } which takes variables as a parameter (if any) and a body of a function
- The body of a function is written after the variable (if any) followed by → operator.
- Syntax: { variable(s) → body_of_lambda }

# Normal function: addition of two numbers

```kotlin
// normal function
fun addNumber(a: Int, b: Int) {
	val add = a + b
	println(add)
}

// using lambda expression, return
val sum: (Int, Int) -> Int = { a: Int, b: Int -> a + b } 

// even shorter, not returning value 
val sum = { a: Int, b: Int -> println(a + b) } 
```

# Visibility Modifiers - public - private - internal - protected

### What is a Visibility Modifier?

- Visibility modifiers are the keywords which are used to restrict the use of classes, interfaces, methods, and properties in Kotlin.
- These modifiers are used at multiple places such as class header or method body.
- Visibility Modifiers are categorized into four different types:
    - public
    - private
    - protected
    - internal

### Public Modifier

- A **public** modified element is accessible from everywhere in the project.
- It is a **default modifie**r in Kotlin. If any class, interface etc. are not specified with any access/visibility modifier then that class, interface etc. is used in a public scope.
- All public declarations can be placed at the top of the file.
- If a member of a class is not specified then it is **by default public.**

### Private Modifier

- A private modifier allows the element to be accessible only within the **block in which properties, fields, etc. are declared.**
- The **private** modifier declaration does not allow access outside the scope.
- A **private** package can be accessible within that specific file.

### Internal Modifier

- The **internal** modifier is feature in Kotlin, which is not available in Java.
- The **internal** modifier makes the field visible only inside the module in which it is implemented.
- All the fields are declared as internal which are accessible only inside the module in which they are implemented.

### Open keyword

- In Kotlin all classes are **final** by default, so they **can't be inherited** by default
- Side note: **in Java it's the opposite**, there you have to make your class final explicitly
- So to make a class inheritable to other classes you must mark it with the **open keyword**, else you get an error "type is final so can't be inherited"

### Protected Modifier

- A **protected modifier** with a class or an interface allows visibility to its class or subclass only.
- A protected declaration (when overridden) it its subclass is also protected unless it is explicitly changed.
- **The Protected modifier** CANNOT be declared at top level. (for Packages)

# Nested class and Inner class

- A class which is created inside another class and a class which is created inside another class with keyword inner

### Nested class

- **Nested class** is such class which is created inside another class.
- In Kotlin, a nested class is by default static, so its data members and member functions can be accessed without creating an object of the class.
- Nested classes cannot access the data members of outer classes.

```kotlin
class OuterClass {
	class NestedClass {
	}
}
```

### Inner class

- **An Inner class** is a class which is created inside another class with **keyword inner.**
- In other words, we can say that a nested class which is marked as **"inner"** is called inner class.
- Inner class cannot be declared inside interfaces or non-inner nested classes.
- The advantage of inner class over nested class is that, it is able to access members of its outer class even it is private.

```kotlin
class OuterClass {
	inner class InnerClass {
	}	
}
```

# Safe Cast and Unsafe Cast Operator

### Unsafe cast operator: as

- Sometimes it is not possible to cast a variable and it throws an exception, this is called an **unsafe cast.**
- The unsafe cast is performed by the infix operator **as.**

### Unsafe cast example

- A nullable string(String?) cannot be cast to non nullable string(String), this throws an exception.

```kotlin
fun main(args: Array<String>) {
	val obj: Any? = null
	val str: String = obj as String
	println(str)
}
// Output:
// Exception in thread "main" kotlin.TypeCastException: null cannot be cast to non-null type kotlin. String.
```

### Generates a ClassCastException

- Trying to cast an integer value of the **Any** type into a string type leads to a ClassCastException.

```kotlin
val obj: Any = 123
val str: String = obj as String 
//Throws java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
```

### Nullable for Casting to work:

- Source and target variables needs to be a nullable for casting to work:

```kotlin
fun main(args: Array<String>) {
	val obj: Any? = "String unsafe cast"
	val str: String? = obj as String? //Works
	println(str)
}
```

### Safe cast operator: as?

- as? provides a safe cast operation to safely cast to a type
- It returns a null if casting is not possible rather than throwing an ClassCastException exception.

```kotlin
fun main(args: Array<String>){
	val location: Any = "Kotlin"
	val safeString: String? = location as? String
	val safeInt: Int? = location as? Int
	println(safeString) //kotlin 
	println(safeInt) //null 
}
```

# Exception Handling With Try and Catch

- Handling runtime problems which occur in the program and would otherwise lead to program termination.

### What is an Exception?

- **An Exception** is a runtime problem which occurs in the program and leads to program termination.
    - running out of memory
    - array out of bound
    - condition like divide by zero
- To handle this type of problem during program execution the technique of **exception handling** is used.
- **Exception handling** is a technique which handles the runtime problems and maintains the flow of program execution.

# Throwable Class

- throw MyException ("this throws an exception")
- There are four different keywords used in exception handling: These are
    - try, catch, finally, throw

### Keywords used in exception handling

- **try:** the try block contains a set of statements which might generate an exception. It must be followed by either catch to finally or both.
- **catch:** the catch block is used to catch the exception thrown from try block.
- **finally:** finally block always execute whether exception is handled or not. So it is used to execute important code statement. (like closing buffers)
- **throw:** the throw keyword is used to throw an exception explicitly.

### Unchecked Exception

- Unchecked exception is that exception is thrown due to mistakes in our code.
- This exception type extends the **RuntimeException** class.
- The Unchecked exception is checked at run time.

### Example of unchecked exception

- **ArithmeticException:** thrown when we divide a number by zero.
- **ArrayIndexOutOfBoundExceptions:** thrown when an array has been tried to access with incorrect index value.
- **SecurityException:** thrown by the security manager to indicate a security violation.
- **NullPointerException:** thrown when invoking a method or property on a null object.

### Checked Exception

- A Checked exception is checked at compile time.
- This exception type extends the **Throwable** class.
- IOException.
- SQLException etc.

### throw example

```kotlin
fun main(args: Array<String>) {
	validate(15)
	println("Code after validation check...")
}
 
fun validate(age: Int) {
	if(age < 18) 
		throw ArithmeticException("under age")
	else 
		println("eligible for drive")
}

```

**ℹ️ Why would you use a nested class over an outer class?**

⇒ So its data members and member function can be accessed without creating an object of the class.

### Safe Casting

```kotlin
val x: String? = y as? String 
```
