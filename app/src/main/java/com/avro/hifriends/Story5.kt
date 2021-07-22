package com.avro.hifriends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Story5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story5)

        var btnAmin = findViewById<Button>(R.id.btnAmin)
        btnAmin.setOnClickListener {
            Intent(this, Story6::class.java).also { startActivity(it) }
        }
    }
}