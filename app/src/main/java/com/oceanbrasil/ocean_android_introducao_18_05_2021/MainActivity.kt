package com.oceanbrasil.ocean_android_introducao_18_05_2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvNome = findViewById<TextView>(R.id.tvNome)

        tvNome.setOnClickListener {
            tvNome.text = "Novo texto"
        }
    }
}
