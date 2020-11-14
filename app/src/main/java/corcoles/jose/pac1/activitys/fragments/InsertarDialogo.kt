package corcoles.jose.pac1.activitys.fragments

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import corcoles.jose.pac1.R


class InsertarDialogo : DialogFragment() {

        override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
            //Inflamos el layot personalizado para el dialogo
            val inflater= requireActivity().layoutInflater

            return activity?.let {
                val builder = AlertDialog.Builder(it)
               builder.setView(inflater.inflate(R.layout.dialogo_insertar,null))


                builder.setTitle("Nueva Entrada")
                    .setPositiveButton("Guardar",
                        DialogInterface.OnClickListener { dialog, id ->//Aquitendre que insertar en base de datos
                            Toast.makeText(activity,"Entrada Enviada", Toast.LENGTH_LONG).show()
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

