package com.dares03.e1_interaccionconimagenes

import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imagen = findViewById<ImageButton>(R.id.imagenClick01)
        imagen.setOnClickListener{
            Toast.makeText(this,"Kaká", LENGTH_LONG).show()
        }
    }
}