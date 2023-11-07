package com.example.banco_jofago

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.example.banco_jofago.databinding.ActivityTransferBinding

class TransferActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTransferBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTransferBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val radioGroup = findViewById<RadioGroup>(R.id.elegir)
        val spinner_propia = findViewById<Spinner>(R.id.spinner_propia)
        val text_ajena = findViewById<EditText>(R.id.text_ajena)

        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.cuenta_propia -> {
                    spinner_propia.visibility = View.VISIBLE
                    text_ajena.visibility = View.INVISIBLE
                }
                R.id.cuenta_ajena -> {
                    spinner_propia.visibility = View.GONE
                    text_ajena.visibility = View.VISIBLE
                }
            }
        }

        val btnEnviar = findViewById<Button>(R.id.boton_enviar)
        val btnCancelar = findViewById<Button>(R.id.boton_cancelar)

        btnEnviar.setOnClickListener {

        }

        btnCancelar.setOnClickListener {
        }
    }
}
