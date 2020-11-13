package corcoles.jose.pac1.activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import corcoles.jose.pac1.R
import kotlinx.android.synthetic.main.activity_tabla.*

class TablaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tabla)
        Toast.makeText(this, "Estas en el Activity de Creación de tabla",
            Toast.LENGTH_LONG).show()
        btnVolver.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}