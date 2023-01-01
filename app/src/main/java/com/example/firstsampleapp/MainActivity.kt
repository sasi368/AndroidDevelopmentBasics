package com.example.firstsampleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //for car class
        val carClass = Car()
        carClass.start()
        //for driver class
        val driverClass = Driver("sam")
        driverClass.showDriverDetails()
        //for myCar class
        val myCarClass = MyCar()
        myCarClass.start()

        val textView = findViewById<TextView>(R.id.hello)
        val textInput = findViewById<EditText>(R.id.textInputId)
        val submitBtn = findViewById<Button>(R.id.btnSubmit)
        val offerBtn = findViewById<Button>(R.id.offerBtn)
        var enterName = ""

        submitBtn.setOnClickListener {
          enterName = textInput.text.toString()
            if(enterName == ""){
                Toast.makeText(
                    this@MainActivity,
                    "Please Enter Name",
                    Toast.LENGTH_SHORT).show()

                Log.i("VALIDATION","Please Enter Name")
            }else{
                offerBtn.visibility = VISIBLE;
                val message = "Hello $enterName"
                textView.text = message
                textInput.text.clear()
            }
        }


        val navigate = Intent(this,MainActivity2::class.java)
        offerBtn.setOnClickListener{
            navigate.putExtra("NAME",enterName)
            startActivity(navigate)
        }
    }

    //Activity LifeCycle
    override fun onStart() {
        super.onStart()
        Log.i("OnStart","MainActivity")
    }

    override fun onResume() {
        super.onResume()
        Log.i("onResume","MainActivity")
    }

    override fun onPause() {
        super.onPause()
        Log.i("onPause","MainActivity")
    }

    override fun onStop() {
        super.onStop()
        Log.i("onStop","MainActivity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("onDestroy","MainActivity")
    }
}
