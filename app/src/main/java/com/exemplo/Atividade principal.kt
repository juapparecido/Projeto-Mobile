package com.example.diogoddc

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.example.diogoddc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val context: Context get() = this

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.root.setOnClickListener() {
            onClickMuseu()
        }
    }

    fun onClickMuseu() {
        val intent = Intent(context, MuseuActivity::class.java)
        startActivity(intent)
    }

}
