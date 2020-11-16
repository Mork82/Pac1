package corcoles.jose.pac1.activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import corcoles.jose.pac1.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btnIrAtcv2.setOnClickListener {
            val intent = Intent(this, TablaActivity::class.java)
            startActivity(intent)
        }
        btnIrActv3.setOnClickListener {
            val intent = Intent(this, ReproductorActivity::class.java)
            startActivity(intent)
        }
    }




}