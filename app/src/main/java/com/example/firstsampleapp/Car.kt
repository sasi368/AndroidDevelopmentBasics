package com.example.firstsampleapp

import android.util.Log
import android.widget.Toast

open class Car {

    var carSpeed = 190
    open fun start(){
        Log.i("carTag","Car is Started")
    }
}