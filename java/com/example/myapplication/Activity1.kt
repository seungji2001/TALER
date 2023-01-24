package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.momlogin)


        val moveBtn3: Button = findViewById(R.id.btn18)

        moveBtn3.setOnClickListener {
            val intent: Intent = Intent(this,Activity2::class.java)
            startActivity(intent)
        }

        val moveBtn4: Button = findViewById(R.id.btn19)

        moveBtn4.setOnClickListener {
            val intent: Intent = Intent(this,Activity3::class.java)
            startActivity(intent)
        }
    }
}