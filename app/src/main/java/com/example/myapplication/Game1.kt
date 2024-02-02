package com.example.myapplication

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.constraintlayout.widget.ConstraintLayout

class Game1 : ComponentActivity() {
    var number = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_empty)

        val layout: ConstraintLayout = findViewById(R.id.constraintLayout)
        val numberView: TextView = findViewById(R.id.numberView)
        val resetButton: Button = findViewById(R.id.buttonReset)

        layout.setBackgroundColor(Color.GRAY)

        layout.setOnClickListener {
            number++
            numberView.text = "${number}"
        }

        resetButton.setOnClickListener {
            number = 0
            numberView.text = "${number}"
        }

        numberView.text = "${number}"

    }
}