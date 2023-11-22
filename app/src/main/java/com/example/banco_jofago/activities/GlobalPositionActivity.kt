package com.example.banco_jofago.activities

import CuentasAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.banco_jofago.bd.MiBancoOperacional
import com.example.banco_jofago.databinding.ActivityGlobalPositionBinding
import com.example.banco_jofago.pojo.Cliente
import com.example.banco_jofago.pojo.Cuenta

class GlobalPositionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGlobalPositionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGlobalPositionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerViewCuentas.layoutManager = LinearLayoutManager(this)




        val cliente = intent.getSerializableExtra("Cliente") as Cliente

        val miBancoOperacional = MiBancoOperacional.getInstance(this)
        val cuentas = miBancoOperacional?.getCuentas(cliente)as ArrayList<Cuenta>

        val cuentasAdapter = CuentasAdapter(cuentas)

        val linearLayoutManager = LinearLayoutManager(this)

        binding.recyclerViewCuentas.apply {
            layoutManager = linearLayoutManager
            adapter = cuentasAdapter
        }
    }


}