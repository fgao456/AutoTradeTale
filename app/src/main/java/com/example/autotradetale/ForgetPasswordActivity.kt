package com.example.autotradetale

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



    class ForgetPasswordActivity : AppCompatActivity() {
        @SuppressLint("MissingInflatedId")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_forgetpassword)

            val backTextView = findViewById<TextView>(R.id.backTextView)

            val email = findViewById<EditText>(R.id.inputEmail)

            val sp = applicationContext.getSharedPreferences("UserPreferences",
                Context.MODE_PRIVATE)
            val emailAddress = sp.getString("password","")

            email.setText(emailAddress)

            backTextView.setOnClickListener{
                // Redirect to the Sign Up Page after the button is clicked
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }