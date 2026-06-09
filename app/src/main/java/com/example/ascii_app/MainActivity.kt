package com.example.ascii_app

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // val for text view
        val txtArt = findViewById<TextView>(R.id.txtArt)
        // Variable to show the art
        var art = ""
        // Counter (inspired by ChatGPT Open AI brainstorming)
        var row = 1
        // While loop
        while (row <= 7) {
            var stars = 1
            // Add stars
            while (stars <= row) {
                art += "*"
                stars++
            }
            // Next line
            art += "\n"
            // Next line
            row++
        }
        // Result
        txtArt.text = art

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}