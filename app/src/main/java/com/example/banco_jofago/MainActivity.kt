package com.example.banco_jofago

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.banco_jofago.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val dni = intent.getStringExtra("dni")

        // Actualiza el mensaje de bienvenida con el número de DNI
        binding.bienvenido.text = "Bienvenido/a, $dni"


        binding.cambiarPassword.setOnClickListener{
            val intent = Intent(this, CambiarPasswordActivity::class.java )
            startActivity(intent)
        }
    }
}