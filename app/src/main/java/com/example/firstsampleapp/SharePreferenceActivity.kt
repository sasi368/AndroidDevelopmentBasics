package com.example.firstsampleapp

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

private lateinit var nameText : EditText
private lateinit var ageText : EditText
private lateinit var sf: SharedPreferences
private lateinit var editor: SharedPreferences.Editor

class SharePreferenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share_preference)

        nameText = findViewById(R.id.nameTxt)
        ageText = findViewById(R.id.ageTxt)

        sf = getSharedPreferences("my_sf", MODE_PRIVATE)
        editor = sf.edit()
    }

    override fun onPause() {
        super.onPause()
        val name = nameText.text.toString()
        val age = ageText.text.toString().toInt()
        editor.apply{
            putString("sf_name",name)
            putInt("sf_age",age)
            commit()
        }
    }

    override fun onResume() {
        super.onResume()
        val name = sf.getString("sf_name",null)
        val age = sf.getInt("sf_age",0)
        nameText.setText(name)
        if(age != 0) {
            ageText.setText(age.toString())
        }
    }
}