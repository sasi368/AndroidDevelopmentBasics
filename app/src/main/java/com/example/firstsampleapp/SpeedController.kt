package com.example.firstsampleapp

interface SpeedController {

    fun accelerate()
    fun decelerate()
    fun getBrandId():String{
        return "brand id: 123456"
    }
}