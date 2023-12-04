package com.example.autotradetale

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    // define a SharedPreferences object
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profilepage)

        // Initialize SharedPreferences with the same name in all activities that need user info
        sharedPreferences = getSharedPreferences("UserInfoPreferences", Context.MODE_PRIVATE)

        val userEmail = sharedPreferences.getString("CurrentUserEmailKey","")
        val userInfo = sharedPreferences.getString(userEmail,"")
        val infos = userInfo?.split(",")

        val fullName = findViewById<TextView>(R.id.fullNameText)
        val emailTextView = findViewById<TextView>(R.id.emailContent)

        fullName.text = (infos?.get(1) ?: "") + " " + (infos?.get(2) ?: "")
        emailTextView.text = userEmail

        val buttonBack = findViewById<Button>(R.id.profilePageBackButton)
        // Set the onClickListener for the Back button
        buttonBack.setOnClickListener {
            finish() // Finish the activity, returning to the previous screen
        }

        val buttonLogout = findViewById<Button>(R.id.logOutButton)
        // Set the onClickListener for the Back button
        buttonLogout.setOnClickListener {
            // Switch to SignIn page
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}