package com.example.question_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android_layout.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
    }
}