package com.example.fragment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragment2.databinding.ActivityResactivityBinding
import com.example.fragment2.fragmentos.fifth
import com.example.fragment2.fragmentos.forth
import com.example.fragment2.fragmentos.third

class Resactivity : AppCompatActivity() {
    private lateinit var binding: ActivityResactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val fragment3 = third()
        val fragment4 = forth()
        val fragment5 = fifth()
        binding.btnfrgm3.setOnClickListener { 
            supportFragmentManager
                .beginTransaction()
                .addToBackStack(null)
                .setCustomAnimations(
                    R.anim.slide_in, // enter
                    R.anim.fade_out, // exit
                    R.anim.fade_in,  // popEnter
                    R.anim.slide_out // popExit
                )
                .replace(R.id.fragmentContainerView,fragment3)
                .commit()

        }
        binding.btnfrgmnt4.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .addToBackStack(null)
                .setCustomAnimations(
                    R.anim.slide_in, // enter
                    R.anim.fade_out, // exit
                    R.anim.fade_in,  // popEnter
                    R.anim.slide_out // popExit
                )
                .replace(R.id.fragmentContainerView,fragment4)
                .commit()
        }
        binding.btnfragmnt5.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .addToBackStack(null)
                .setCustomAnimations(
                    R.anim.slide_in, // enter
                    R.anim.fade_out, // exit
                    R.anim.fade_in,  // popEnter
                    R.anim.slide_out // popExit
                )
                .replace(R.id.fragmentContainerView,fragment5)
                .commit()
            }
        }
    }