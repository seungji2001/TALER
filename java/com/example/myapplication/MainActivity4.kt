package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.picture)
        val moveBtn: Button = findViewById<Button>(R.id.btn16)

        moveBtn.setOnClickListener{

            val intent: Intent = Intent(this,Activity5::class.java)
                    startActivity(intent)
        }

        val moveBtn2: Button = findViewById(R.id.btn17)

        moveBtn2.setOnClickListener {
            val intent: Intent = Intent(this,Activity1::class.java)
                    startActivity(intent)
        }
    }


}