package com.example.autotradetale

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FilterActivity: AppCompatActivity() {

    // define a SharedPreferences object
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filter)

        val buttonBack = findViewById<Button>(R.id.backButton)
        // Set the onClickListener for the Back button
        buttonBack.setOnClickListener {
            finish() // Finish the activity, returning to the previous screen
        }
    }
}