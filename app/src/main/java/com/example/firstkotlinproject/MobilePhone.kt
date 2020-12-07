package com.example.firstkotlinproject

class MobilePhone constructor(osName: String = "Android", brand: String = "Samsung", model: String = "Samsung Galaxy S20 Ultra") {

    private var battery: Int = 50

    init {
        println("model")
        println("Here the osName is Android, brand is $brand, model is $model")
    }

    fun chargeBattery(chargedBy: Int) {
        println("Battery was at $battery and is at ${battery+chargedBy} now")
        battery += chargedBy
    }

}