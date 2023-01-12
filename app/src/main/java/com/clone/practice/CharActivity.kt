package com.clone.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CharActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_char)
    }

    /*private fun setPicture() {
        (context as MainActivity).supportFragmentManager
            .beginTransaction()
            .replace(R.id.picture_video_frm, ListPictureLockerFragment().apply {
                arguments = Bundle().apply {
                    val gson = Gson()
                    val pictureJson = gson.toJson(pictureList)
                    putString("picture",pictureJson)
                }
            })
            .commitAllowingStateLoss()
    }*/
}