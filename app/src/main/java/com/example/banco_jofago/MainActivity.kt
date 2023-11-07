package com.example.banco_jofago


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.banco_jofago.bd.MiBancoOperacional
import com.example.banco_jofago.databinding.ActivityMainBinding
import com.example.banco_jofago.pojo.Cliente
import com.example.banco_jofago.pojo.Cuenta
import com.example.banco_jofago.pojo.Movimiento

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val dni = intent.getStringExtra("dni")

        // Actualiza el mensaje de bienvenida con el número de DNI
        binding.bienvenido.text = dni


        binding.cambiarPassword.setOnClickListener{
            val intent = Intent(this, CambiarPasswordActivity::class.java )
            startActivity(intent)
        }
        binding.transferencias.setOnClickListener{
            val intent = Intent(this, TransferActivity::class.java )
            startActivity(intent)
        }
    }
}