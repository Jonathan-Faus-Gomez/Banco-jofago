package com.example.banco_jofago

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.banco_jofago.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val dni = intent.getStringExtra("dni")

        // Actualiza el mensaje de bienvenida con el número de DNI
        binding.bienvenido.text = "Bienvenido/a, $dni"
    }
}