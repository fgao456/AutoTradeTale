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

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val signUpButton = findViewById<Button>(R.id.signUpButton)
        signUpButton.setOnClickListener {
            // Start the SignUpActivity when the sign-up button is clicked
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        val forgotPasswordButton = findViewById<Button>(R.id.forgotPasswordButton)
        forgotPasswordButton.setOnClickListener {
            // Start the forgotPasswordActivity when the forgotPassword button is clicked
            val intent = Intent(this, ForgotPassWordActivity::class.java)
            startActivity(intent)
        }
    }
}
