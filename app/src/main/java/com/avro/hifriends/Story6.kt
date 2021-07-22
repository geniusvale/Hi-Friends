package com.avro.hifriends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Story6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story6)

        var btnBaiklah = findViewById<Button>(R.id.btnBaiklah)
        btnBaiklah.setOnClickListener {
            Intent(this, StoryEnd::class.java).also { startActivity(it) }
        }
    }
}