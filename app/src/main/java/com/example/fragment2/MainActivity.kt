
package com.example.fragment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragment2.databinding.ActivityMainBinding
import java.nio.channels.spi.AsynchronousChannelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    binding.btn1.setOnClickListener {
        val intent = Intent(this, Resactivity ::class.java)
        startActivity(intent)
        }
    }
}