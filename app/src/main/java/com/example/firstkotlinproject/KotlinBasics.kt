package com.example.firstkotlinproject


fun main() {

}

//Mutable Variables
fun mutableVariables() {
    var myName = "Frank"
    myName = "Franzis"
    print("Hello " + myName)
}

//Immutable Variables, constants
fun immutableVariables() {
    val myName = "Frank"
    print("Hello " + myName)
}

//Datatypes of numbers
fun numbers() {
    val myByte: Byte = 12 //8 bit
    val myShort: Short = 125 //16 bit
    val myInt: Int = 123123 //32 bit
    val myLong: Long = 12_123_123_123_123_123 //64 bit

    val myFloat: Float = 13.37F // 32bit
    val myDouble: Double = 3.123131542312312 //64 Bit

}

//Datatypes bool, char and String
fun boolCharString() {
    //Boolean
    var isSunny: Boolean = true
    isSunny = false

    //Characters
    val letterChar: Char = 'A'
    val digitChar: Char = '1'

    //Strings
    val myStr: String = "Hello World"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]

}

//Exercise
/*
"Android Masterclass"

13.37F

3.14159265358979

25

2020

18881234567

true

'a'


* */

fun exercise() {
    val valString: String = "Android Masterclass"
    print(valString)
    val valFloat: Float = 13.37F
    print(valFloat)
    val valDouble: Double = 3.14159265358979
    print(valDouble)
    val valShort: Short = 25
    print(valShort)
    val valInteger: Int = 2020
    print(valInteger)
    val valLong: Long = 18881234567
    print(valLong)
    val valBoolean: Boolean = true
    print(valBoolean)
    val valCharacter: Char = 'a'
    print(valCharacter)
}


