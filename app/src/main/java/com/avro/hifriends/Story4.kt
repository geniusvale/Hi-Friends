package com.avro.hifriends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Story4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story4)

        var btnApaItu = findViewById<Button>(R.id.btnApaItu)
        btnApaItu.setOnClickListener {
            Intent(this, Story5::class.java).also { startActivity(it) }
        }
    }
}