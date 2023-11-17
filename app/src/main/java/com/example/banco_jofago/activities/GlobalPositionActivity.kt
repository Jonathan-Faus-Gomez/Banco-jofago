import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.banco_jofago.bd.MiBancoOperacional
import com.example.banco_jofago.databinding.ActivityGlobalPositionBinding
import com.example.banco_jofago.pojo.Cliente

class GlobalPositionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGlobalPositionBinding
    private lateinit var cuentasAdapter: CuentasAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGlobalPositionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        cuentasAdapter = CuentasAdapter()
        binding.recyclerView.adapter = cuentasAdapter


        val cliente = intent.getSerializableExtra("Cliente") as Cliente


        val miBancoOperacional = MiBancoOperacional.getInstance(this)
        val cuentas = miBancoOperacional?.getCuentas(cliente)

        cuentasAdapter.submitList(cuentas)
    }


}