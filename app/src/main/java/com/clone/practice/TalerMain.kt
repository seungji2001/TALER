package com.clone.practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.clone.practice.databinding.ActivityTalerMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView

class TalerMain : AppCompatActivity() {
    private lateinit var binding: ActivityTalerMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTalerMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager
            .beginTransaction()
            .replace(binding.frameFragment.id,MainWordFragment())
            .commitAllowingStateLoss()

        binding.bookEnrollBtn.setOnClickListener{
            startActivity(Intent(this,EnrollBookActivity::class.java))
        }
    }




    /*private fun removeIcons(view: BottomNavigationView){
        var menuView:BottomNavigationMenuView
        for (i:Int in 0..10 step(1)){

        }
    }*/
}