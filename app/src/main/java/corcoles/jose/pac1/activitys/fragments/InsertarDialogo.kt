package corcoles.jose.pac1.activitys.fragments

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment


    class InsertarDialogo : DialogFragment() {

        override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
            return activity?.let {
                // Use the Builder class for convenient dialog construction
                val builder = AlertDialog.Builder(it)
                builder.setTitle("Pantalla de Login")
                    .setPositiveButton("Guardar",
                        DialogInterface.OnClickListener { dialog, id ->
                            Toast.makeText(activity,"Esto funciona", Toast.LENGTH_LONG).show()
                            dialog.dismiss()//cerramos
                        })
                    .setNegativeButton("Cancelar",
                        DialogInterface.OnClickListener { dialog, id ->
                            // Cerrar cuadro dialogo
                            dialog.dismiss()
                        })
                // Create the AlertDialog object and return it
                builder.create()
            } ?: throw IllegalStateException("Activity cannot be null")
        }
    }

