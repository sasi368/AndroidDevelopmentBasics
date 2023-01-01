package com.example.firstsampleapp

import android.util.Log

class Driver(name: String) {

    var driverName = name;
    //or
    //var driverName = ""
    //init {
    //  driverName = name
    //}
    //or
    // No initial dummy value needed for lateinit
    // Nullable type isn't supported in lateinit
    //private lateinit var driverName:String //must contain object type
    //init {
    //  driverName = name
    //}

    fun showDriverDetails(){
        Log.i("driverTag","Name of the driver is: $driverName")
    }
}