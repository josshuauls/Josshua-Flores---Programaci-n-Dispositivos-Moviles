package com.dares03.practica6

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dares03.practica6.adaptar.UsuariosAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
    }

    fun initRecyclerView(){
        val manager = LinearLayoutManager(this)
        val decoration = DividerItemDecoration(this,manager.orientation)
        val userRecycle = findViewById<RecyclerView>(R.id.listaUsuarios)

        userRecycle.layoutManager = manager
        userRecycle.adapter = UsuariosAdapter(UsuarioProvider.listaUsuario)

        userRecycle.addItemDecoration(decoration)
    }
}