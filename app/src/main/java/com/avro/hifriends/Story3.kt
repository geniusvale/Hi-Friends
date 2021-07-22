package com.avro.hifriends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Story3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story3)

        var btnWow = findViewById<Button>(R.id.btnWow)
        btnWow.setOnClickListener {
            Intent(this, Story4::class.java).also { startActivity(it) }
        }
    }
}