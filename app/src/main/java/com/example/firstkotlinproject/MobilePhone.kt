package com.example.firstkotlinproject

class MobilePhone constructor(osName: String = "Android", brand: String = "Samsung", model: String = "Samsung Galaxy S20 Ultra") {

    init {
        println("model")
        println("Here the osName is Android, brand is $brand, model is $model")
    }

}