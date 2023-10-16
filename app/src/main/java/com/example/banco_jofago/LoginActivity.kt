package com.example.banco_jofago

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.banco_jofago.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity(){
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)

        binding.botonEntrar.setOnClickListener {
            val dni = binding.usuario.editText?.text.toString()
            val password = binding.password.editText?.text.toString()

            if (dni.isEmpty() || password.isEmpty()) {
                binding.usuario.error="Por favor rellene ambos campos"
                binding.password.error="Por favor rellene ambos campos"
            } else {
                val intent = Intent(this, MainActivity::class.java )
                intent.putExtra("dni",dni)
                startActivity(intent)
            }
        }

        binding.botonSalir.setOnClickListener {
            finish()
        }
    }
}