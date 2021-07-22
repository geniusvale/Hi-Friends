package com.avro.hifriends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StoryEnd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story_end)

        var btnSelesai = findViewById<Button>(R.id.btnSelesai)
        btnSelesai.setOnClickListener {
            Intent(this, CalendarEnd::class.java).also { startActivity(it) }
        }
    }
}