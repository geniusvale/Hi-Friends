package com.avro.hifriends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Story1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story1)

        var btnMemangKenapa = findViewById<Button>(R.id.btnMemangKenapa)
        btnMemangKenapa.setOnClickListener {
            Intent(this, Story2::class.java).also { startActivity(it)
            }
        }
    }
}