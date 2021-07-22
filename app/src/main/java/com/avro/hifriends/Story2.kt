package com.avro.hifriends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Story2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story2)

        var btnHehe = findViewById<Button>(R.id.btnHehe)
        btnHehe.setOnClickListener {
            Intent(this, Story3::class.java).also { startActivity(it) }
        }
    }
}