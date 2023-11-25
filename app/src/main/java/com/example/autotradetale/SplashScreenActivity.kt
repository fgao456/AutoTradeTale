package com.example.autotradetale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val splashDuration = 3000 // 3 seconds in milliseconds
        Handler().postDelayed({
            // Start main activity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Close the splash activity
        }, splashDuration.toLong())
    }
}