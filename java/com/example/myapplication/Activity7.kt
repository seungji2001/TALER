package com.example.myapplication

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts

class Activity7 : AppCompatActivity() {

    lateinit var bitmap: Bitmap
    lateinit var imageView: ImageView
    lateinit var imageView2: ImageView
    lateinit var imageView3: ImageView
    lateinit var imageView4: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.camera);

        imageView = findViewById(R.id.img1)
        imageView2 = findViewById(R.id.img2)
        imageView3 = findViewById(R.id.img3)
        imageView4 = findViewById(R.id.img4)
        val picBtn: ImageButton = findViewById(R.id.imgbtn1)
        var i = 0;

        picBtn.setOnClickListener {
            var index =i % 5
            val intent: Intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            if(index== 0) {
                activityResult.launch(intent)
            }

            if(index== 1) {
                activityResult2.launch(intent)
            }
            if(index== 3) {
                activityResult3.launch(intent)
            }
            if(index== 4) {
                activityResult4.launch(intent)
            }

            i++
        }

    }

    private val activityResult:ActivityResultLauncher<Intent> = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()){
        if(it.resultCode == RESULT_OK && it.data != null){
            val extras = it.data!!.extras

            bitmap = extras?.get("data") as Bitmap

            imageView.setImageBitmap(bitmap)
        }
    }

    private val activityResult2:ActivityResultLauncher<Intent> = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()){
        if(it.resultCode == RESULT_OK && it.data != null){
            val extras = it.data!!.extras

            bitmap = extras?.get("data") as Bitmap

            imageView2.setImageBitmap(bitmap)
        }
    }
    private val activityResult3:ActivityResultLauncher<Intent> = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()){
        if(it.resultCode == RESULT_OK && it.data != null){
            val extras = it.data!!.extras

            bitmap = extras?.get("data") as Bitmap

            imageView3.setImageBitmap(bitmap)
        }
    }
    private val activityResult4:ActivityResultLauncher<Intent> = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()){
        if(it.resultCode == RESULT_OK && it.data != null){
            val extras = it.data!!.extras

            bitmap = extras?.get("data") as Bitmap

            imageView4.setImageBitmap(bitmap)
        }
    }

}