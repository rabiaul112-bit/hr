package com.example.helloworld

import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // فرض اللغة العربية بغض النظر عن لغة الجهاز
        val config = resources.configuration
        config.setLocale(Locale("ar"))
        resources.updateConfiguration(config, resources.displayMetrics)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            Toast.makeText(this, "مرحباً بك في تطبيقك العربي الأول!", Toast.LENGTH_SHORT).show()
        }
    }
}
