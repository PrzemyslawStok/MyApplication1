package com.example.myapplication

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.myapplication.databinding.ActivityGame2Binding

class Game2 : ComponentActivity() {
    var number = 1000

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityGame2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val numberView = binding.numberView
        val resetButton = binding.buttonReset


    }
}