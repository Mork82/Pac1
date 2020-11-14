package corcoles.jose.pac1.activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import corcoles.jose.pac1.R
import corcoles.jose.pac1.activitys.fragments.InsertarDialogo
import db.CarApp
import kotlinx.android.synthetic.main.activity_tabla.*

class TablaActivity : AppCompatActivity() {
  // val app = applicationContext as CarApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tabla)

        Toast.makeText(this, "Estas en el Activity de Creación de tabla",
            Toast.LENGTH_LONG).show()

        btnCrear.setOnClickListener {  }


        btnInsertar.setOnClickListener{
            var insertarDialogo= InsertarDialogo()
            insertarDialogo.show(supportFragmentManager, "Nueva Entrada")


        }



       btnConsultar.setOnClickListener {


        }

        btnVolver.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}