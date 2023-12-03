////package com.example.autotradetale
////
////import androidx.appcompat.app.AppCompatActivity
////import android.os.Bundle
////
////class MainActivity : AppCompatActivity() {
////    override fun onCreate(savedInstanceState: Bundle?) {
////        super.onCreate(savedInstanceState)
////        setContentView(R.layout.activity_main)
////    }
////}
//
//package com.example.autotradetale
//
//import android.content.Intent
//import android.os.Bundle
//import android.widget.Button
//import androidx.appcompat.app.AppCompatActivity
//
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        // Assuming you have a button with the ID signUpButton in your activity_main.xml
//        findViewById<Button>(R.id.signUpButton).setOnClickListener {
//            // Start the SignUpActivity when the sign-up button is clicked
//            startActivity(Intent(this, SignUpActivity::class.java))
//        }
//    }
//}
package com.example.autotradetale

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText


class MainActivity : AppCompatActivity() {

    // define a SharedPreferences object
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize SharedPreferences with the same name in all activities that need user info
        sharedPreferences = getSharedPreferences("UserInfoPreferences", Context.MODE_PRIVATE)

        val emailInput = findViewById<EditText>(R.id.inputEmail)
        val passwordInput = findViewById<EditText>(R.id.inputPassword)

        val signUpButton = findViewById<Button>(R.id.signUpButton)
        signUpButton.setOnClickListener {
            // Start the SignUpActivity when the sign-up button is clicked
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        val forgotPasswordButton = findViewById<Button>(R.id.forgotPasswordButton)
        forgotPasswordButton.setOnClickListener {
            // Start the forgotPasswordActivity when the forgotPassword button is clicked
            val intent = Intent(this, ForgetPasswordActivity::class.java)
            startActivity(intent)
        }

        val signInButton = findViewById<Button>(R.id.signInButton)
        signInButton.setOnClickListener {

            val email = emailInput.text.toString().trim()
            val password = passwordInput.text.toString()

            if(sharedPreferences.contains(email)) {
                val userInfo = sharedPreferences.getString(email,"")
                val infos = userInfo?.split(",")
                if (infos != null) {
                    if(infos.isNotEmpty() && infos[0] == password) {
                        // Start the HomeActivity when the signIn button is clicked
                        val intent = Intent(this, HomeActivity::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, "Wrong password, please try again",
                            Toast.LENGTH_SHORT).show()
                    }
                }
            } else {
                Toast.makeText(this, "This email has not been registered! please sign up",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }
}
