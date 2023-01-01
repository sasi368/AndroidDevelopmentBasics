package com.example.firstsampleapp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val successTxt = findViewById<TextView>(R.id.offerTxt)
        val getParamTxt = intent.getStringExtra("NAME")
        val message = "Hello $getParamTxt you are successfully claim your offer"
        successTxt.text = message


        val navToSharedPreference = Intent(this,SharePreferenceActivity::class.java)
        val nextBtn = findViewById<Button>(R.id.nxtBtn)
        nextBtn.setOnClickListener{
            startActivity(navToSharedPreference)
        }

    }


    //Activity LifeCycle
    override fun onStart() {
        super.onStart()
        Log.i("OnStart","MainActivity2")
    }

    override fun onResume() {
        super.onResume()
        Log.i("onResume","MainActivity2")
    }

    override fun onPause() {
        super.onPause()
        Log.i("onPause","MainActivity2")
    }

    override fun onStop() {
        super.onStop()
        Log.i("onStop","MainActivity2")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("onDestroy","MainActivity2")
    }
}