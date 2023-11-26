package com.example.autotradetale

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        // Reference to the input fields and buttons
        val firstNameInput = findViewById<EditText>(R.id.editTextFirstName)
        val lastNameInput = findViewById<EditText>(R.id.editTextLastName)
        val emailInput = findViewById<EditText>(R.id.editTextEmail)
        val passwordInput = findViewById<EditText>(R.id.editTextPassword)
        val confirmPasswordInput = findViewById<EditText>(R.id.editTextConfirmPassword)
        val buttonBack = findViewById<Button>(R.id.buttonBack)
        val buttonSignUp = findViewById<Button>(R.id.buttonSignUp)

        // Set the onClickListener for the Back button
        buttonBack.setOnClickListener {
            finish() // Finish the activity, returning to the previous screen
        }

        // Set the onClickListener for the Sign Up button
        buttonSignUp.setOnClickListener {
            // Get the text from input fields
            val firstName = firstNameInput.text.toString().trim()
            val lastName = lastNameInput.text.toString().trim()
            val email = emailInput.text.toString().trim()
            val password = passwordInput.text.toString()
            val confirmPassword = confirmPasswordInput.text.toString()

            // Check if any field is empty
            if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                Toast.makeText(this, "All fields must be filled!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Check if passwords match
            if (password != confirmPassword) {
                Toast.makeText(this, "Passwords do not match!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // If all checks pass, show a success message
            Toast.makeText(this, "Sign Up Successful!", Toast.LENGTH_SHORT).show()

            // Optionally finish the activity or transition to another screen
            // finish() // Uncomment if you want to finish the activity
        }
    }
}
