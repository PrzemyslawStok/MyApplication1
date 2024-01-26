package com.example.myapplication

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.constraintlayout.widget.ConstraintLayout

class EmptyActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_empty)

        val layout: ConstraintLayout = findViewById(R.id.constraintLayout)
        val numberView: TextView = findViewById(R.id.numberView)

        layout.setBackgroundColor(Color.CYAN)
        numberView.text = "0"

    }
}