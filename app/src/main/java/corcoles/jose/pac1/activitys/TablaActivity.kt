package corcoles.jose.pac1.activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import corcoles.jose.pac1.R

class TablaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tabla)
        Toast.makeText(this, "Estas en el Activity de Cración de tabla",
            Toast.LENGTH_LONG).show()


    }
}