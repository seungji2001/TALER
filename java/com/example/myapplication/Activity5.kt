package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.babylogin)


        val moveBtn4: Button = findViewById(R.id.btn6)

        moveBtn4.setOnClickListener {
            val intent: Intent = Intent(this,Activity6::class.java)
            startActivity(intent)
        }
    }
}