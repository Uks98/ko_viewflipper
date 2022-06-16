package com.example.view_flipper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ViewFlipper

class MainActivity : AppCompatActivity() {
    lateinit var btnPrev : Button
    lateinit var btnNext : Button
    lateinit var viewFlipper1 : ViewFlipper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPrev = findViewById(R.id.btnPrev)
        btnNext = findViewById(R.id.btnNext)
        viewFlipper1 = findViewById(R.id.viewFlipper1)

        btnPrev.setOnClickListener {
            viewFlipper1.startFlipping()
            viewFlipper1.setFlipInterval(1000)
        }
        btnNext.setOnClickListener {
            viewFlipper1.stopFlipping()
        }
    }
}