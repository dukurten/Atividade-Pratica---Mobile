package com.aulamobile.atividadepratica

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val edtNome = findViewById<EditText>(R.id.edtNome)
        val edtCurso = findViewById<EditText>(R.id.edtCurso)
        val btnApresentar = findViewById<Button>(R.id.btnApresentar)
        val btnLimpar = findViewById<Button>(R.id.btnLimpar)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        btnApresentar.setOnClickListener {

            val nome = edtNome.text.toString()
            val curso = edtCurso.text.toString()

            val mensagem = getString(
                R.string.mensagem_perfil,
                nome,
                curso
            )

            txtResultado.text = mensagem
        }

        btnLimpar.setOnClickListener {

            edtNome.text.clear()
            edtCurso.text.clear()

            txtResultado.text = getString(R.string.mensagem_inicial)
        }
    }
}