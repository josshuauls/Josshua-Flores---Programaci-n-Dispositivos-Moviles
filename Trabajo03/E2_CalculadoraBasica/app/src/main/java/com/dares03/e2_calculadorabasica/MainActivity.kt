package com.dares03.e2_calculadorabasica

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var valor1 = ""
    var valor2 = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(vista:View){
        val boton = vista as Button
        val entrada = boton.text.toString()
        when(entrada){
            in "1234567890" -> agregarNumero(entrada)
            in "+-*/" -> agregarOperador()
            else -> calcularEntrada()
        }
    }

    fun agregarNumero(digito:String){

    }

    fun agregarOperador(){

    }

    fun calcularEntrada(){

    }
}