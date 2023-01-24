package com.example.myapplication

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import androidx.annotation.RequiresApi

class Activity3 : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.babyaccount)

        val moveBtn4: Button = findViewById(R.id.btn22)

        moveBtn4.setOnClickListener {
            val intent: Intent = Intent(this,Activity4::class.java)
            startActivity(intent)
        }

        val moveBtn7: Button = findViewById<Button>(R.id.btn23)

        var i = 0

        moveBtn7.setOnClickListener {

            val index = i % 3

            if(index == 0){
                moveBtn7.setBackgroundResource(R.drawable.button9)
            }

            if(index == 1){
                moveBtn7.setBackgroundResource(R.drawable.button10)
            }

            if(index == 2){
                moveBtn7.setBackgroundResource(R.drawable.circle)
            }

            i++

        }

        val seekbar1 = findViewById<SeekBar>(R.id.seekbar1)
        val textView = findViewById<View>(R.id.textview5) as TextView

        seekbar1.min = 0
        seekbar1.max = 100


        seekbar1.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, progress: Int, p2: Boolean) {
                textView.text = "$progress"
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })
    }
}