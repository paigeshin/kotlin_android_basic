package com.example.firstkotlinproject

fun main() {

    nullable()

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
    print("save .let")
    printl(length)

}
