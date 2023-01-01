package com.example.firstsampleapp

import android.util.Log

class MyCar: Car(),SpeedController {
    //private --> visibility modifiers
    private val myCarModel = carSpeed
    override fun start() {
        Log.i("myCarTag","we override car start function from parent car class")
        Log.i("myCarTag","getBrand id from SpeedController, ${getBrandId()}")
    }

    override fun accelerate() {
        TODO("Not yet implemented")
    }

    override fun decelerate() {
        TODO("Not yet implemented")
    }
}