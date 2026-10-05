package org.iesch.apppractica

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.iesch.apppractica.databinding.IntroActivityBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: IntroActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = IntroActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.contenedorLogin.setOnClickListener {
            // Se captura la informacion del usuario y contraseña

            val user = binding.textoInputUsuario.text.toString()
            val password = binding.textoPassword.text.toString().trim()

            if(user.isNotEmpty() && password.isNotEmpty()){
                val intent = Intent(this, DashBoardMain::class.java)

                intent.putExtra("usuario",user)

                startActivity(intent)
            } else{
                Toast.makeText(this, "Rellena todos los campos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}