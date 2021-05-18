package com.oceanbrasil.ocean_android_introducao_18_05_2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvNome = findViewById<TextView>(R.id.tvNome)
        val btEnviar = findViewById<Button>(R.id.btEnviar)
        val etNome = findViewById<EditText>(R.id.etNome)

        btEnviar.setOnClickListener {
            val nome = etNome.text.toString()

            if (nome.isNotBlank()) {
                tvNome.text = nome
            } else {
                etNome.error = getString(R.string.insert_valid_name)
            }
        }

        /*
        * Exercício de fixação:
        *
        * Detectar um evento no botão enviar
        * Pegar o texto presente no EditText do Nome
        * Alterar o texto do TextView com o esse texto do EditText
        */
    }
}
