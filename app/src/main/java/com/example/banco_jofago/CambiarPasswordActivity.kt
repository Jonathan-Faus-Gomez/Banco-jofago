package com.example.banco_jofago;

import com.example.banco_jofago.databinding.ActivityCambiarPasswordBinding;
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


public class CambiarPasswordActivity : AppCompatActivity(){
    private lateinit var binding: ActivityCambiarPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCambiarPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.botonEntrar.setOnClickListener {
            val password1 = binding.password1.editText?.text.toString()
            val password2 = binding.password2.editText?.text.toString()

            if (password1.isEmpty() || password2.isEmpty()) {
                binding.password1.error="Por favor introduce la nueva contraseña"
                binding.password2.error="Por favor repite la contraseña"
            } else if(!password1.equals(password2)){
                binding.password2.error="Las contraseñas no coinciden"
            }else {
                val intent = Intent(this, MainActivity::class.java )

                startActivity(intent)
            }
        }

        binding.botonSalir.setOnClickListener {
            finish()
        }
    }

}