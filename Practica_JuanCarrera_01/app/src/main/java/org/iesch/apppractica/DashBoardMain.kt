package org.iesch.apppractica

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.iesch.apppractica.databinding.DashBoardMainBinding
import kotlin.jvm.java

class DashBoardMain : AppCompatActivity() {

    private lateinit var binding: DashBoardMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = DashBoardMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val usuario = intent.getStringExtra("usuario") ?: "user"

        binding.saludoUsuario.text = "Hola $usuario"

        binding.contenedorCanino.setOnClickListener {
            val intent = Intent(this, EdadCanina::class.java)

            startActivity(intent)
        }

    }
}