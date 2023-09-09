package com.example.jatayu_sih

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            window.statusBarColor = resources.getColor(R.color.white, theme)
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = resources.getColor(R.color.white)
        }
        val thread = Thread {
            try {
                Thread.sleep(2000)
            } catch (e: Exception) {
                e.printStackTrace()
            } finally {
                val intent = Intent(this@SplashScreen, SplashActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
        thread.start()
    }
}