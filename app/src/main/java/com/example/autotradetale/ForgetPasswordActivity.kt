package com.example.autotradetale

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



    class ForgetPasswordActivity : AppCompatActivity() {
        @SuppressLint("MissingInflatedId")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_forgetpassword)

            val backTextView = findViewById<TextView>(R.id.backTextView)
            backTextView.setOnClickListener{
                // Redirect to the Sign Up Page after the button is clicked
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }