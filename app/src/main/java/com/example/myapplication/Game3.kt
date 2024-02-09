package com.example.myapplication

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.example.myapplication.databinding.ActivityGame3Binding

class Game3 : ComponentActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityGame3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val mainLayout = binding.gridLayout


    }
}