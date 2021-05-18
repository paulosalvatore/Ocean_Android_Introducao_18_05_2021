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

        /*
         * Desafio:
         * Construir uma tela com três EditText: Nome, Sobrenome e Idade
         * Um TextView para o Resultado
         * Um Botão para Enviar
         *
         * Quando o usuário clicar no botão, validar se todos os dados foram digitados
         * e construir uma string no TextView do Resultado: "Olá, Paulo Salvatore, você tem 27 anos!"
         * Sendo que "Paulo" deve ser preenchido com o valor do EditText e assim por diante.
         *
         * Ao clicar no botão Enviar, você deve adicionar uma mensagem de erro em todos os EditTexts
         * que não passaram da validação.
         */
    }
}
