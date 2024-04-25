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
    var operador = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(vista:View){
        val boton = vista as Button
        val entrada = boton.text.toString()
        when(entrada){
            in "1234567890" -> agregarNumero(entrada)
            in "+-*/" -> agregarOperador(entrada)
            "=" -> calcularEntrada()
        }
    }

    fun agregarNumero(digito:String){
        if(valor1.isEmpty()){
            valor1 = digito
        }
        else{
            valor2 = digito
        }
    }

    fun agregarOperador(operadorNuevo:String){
        if(valor1.isNotEmpty() && valor2.isNotEmpty()){
            return
        }
        operador = operadorNuevo
        actualizarPantallaEntrada()
    }

    fun calcularEntrada(){
        if(valor1.isNotEmpty() && valor2.isNotEmpty()){
            val resultado = when(operador){
                "+" -> valor1.toDouble() + valor2.toDouble()
                "-" -> valor1.toDouble() + valor2.toDouble()
                "*" -> valor1.toDouble() + valor2.toDouble()
                "/" -> valor1.toDouble() + valor2.toDouble()
                else -> 0.0
            }
            actualizarPantallaSalida(resultado.toString())
            valor1 = ""
            valor2 = ""
            operador = ""
        }
    }

    fun actualizarPantallaEntrada(){
        val pantallaEntrada = findViewById<TextView>(R.id.pantallaEntrada)
        pantallaEntrada.text = "$valor1 $operador $valor2"
    }

    fun actualizarPantallaSalida(resultado:String){
        val pantallaSalida = findViewById<TextView>(R.id.pantallaSalida)
        pantallaSalida.text = resultado
    }
}