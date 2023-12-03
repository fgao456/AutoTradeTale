package com.example.autotradetale

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class ForgotPassWordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgetpassword)

        // Reference to the input fields and buttons
        val emailInput = findViewById<EditText>(R.id.inputEmail)
        val buttonReset = findViewById<Button>(R.id.resetPasswordButton)
        val buttonBack = findViewById<Button>(R.id.forgotPasswordBackButton)

        buttonReset.setOnClickListener{
            finish(); // Finish the activity, returning to the previous screen
        }

        buttonBack.setOnClickListener{
            finish(); // Finish the activity, returning to the previous screen
        }
    }
}