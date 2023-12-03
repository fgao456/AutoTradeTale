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
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // variables for shared preferences:



        // variables to extract views from the layouts:

        val email = findViewById<EditText>(R.id.inputEmail)
        val password = findViewById<EditText>(R.id.inputPassword)
        val signInButton = findViewById<Button>(R.id.signInButton)
        val sharedPreferences = getSharedPreferences("UserPreferences", Context.MODE_PRIVATE)



        signInButton.setOnClickListener {

               var emailStr = email.text.toString()
               var  passwordStr = password.text.toString()

               var editor = sharedPreferences.edit()

                editor.putString("email", emailStr)
                editor.putString("password", passwordStr)
                editor.commit()

            Toast.makeText(applicationContext,"User Details Saving", Toast.LENGTH_LONG).show()

        }

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


    }
}
