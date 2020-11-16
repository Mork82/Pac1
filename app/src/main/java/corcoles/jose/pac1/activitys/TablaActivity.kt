package corcoles.jose.pac1.activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import corcoles.jose.pac1.R

import kotlinx.android.synthetic.main.activity_tabla.*
import kotlinx.android.synthetic.main.dialogo_insertar.view.*

class TablaActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tabla)

        Toast.makeText(
            this, "Estas en el Activity de Creación de tabla",
            Toast.LENGTH_LONG
        ).show()

        btnCrear.setOnClickListener { }


        btnInsertar.setOnClickListener {

            dialogo()
        }



        btnConsultar.setOnClickListener {


        }

        btnVolver.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }

    private fun dialogo() {
        //Inflamos el dialogo con la vista personalizada
        val inflater = LayoutInflater.from(this).inflate(R.layout.dialogo_insertar, null)

        //Creamos el dialogo
        val mBuilder = AlertDialog.Builder(this)
            .setView(inflater)
            .setTitle("Nuevo Alumno")
        //mostramos el dialogo
        val mAlertDialog = mBuilder.show()

        inflater.btnDialogGuardar.setOnClickListener {
            //cerramos el dialogo del boton
            mAlertDialog.dismiss()

            //Cojemos los valores de los Edit Text del dialogo

            val nombre = inflater.eTEntradaNombre.text.toString()
            val dni = inflater.eTEntradaDNI.text.toString()
            val direccion = inflater.eTEntradaDireccion.text.toString()

            //seteamos la entrada en el textview del Activity
            tVResultado.setText("Nombre: $nombre\n Dni: $dni\n Dirección: $direccion")

        }// bo¡to0n de salir
        inflater.btnDialogCancel.setOnClickListener {
            mAlertDialog.dismiss()
        }

    }
}