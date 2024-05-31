package com.dares03.practica6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dares03.practica6.adaptar.UsuariosAdapter

class ListaUsuariosFragment : Fragment(R.layout.fragment_lista_usuarios) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
    }

    fun initRecyclerView(){
        val manager = LinearLayoutManager(context)
        val decoration = DividerItemDecoration(context,manager.orientation)
        val userRecycle = requireView().findViewById<RecyclerView>(R.id.listaUsuarios)

        userRecycle.layoutManager = manager
        userRecycle.adapter = UsuariosAdapter(UsuarioProvider.listaUsuario)

        userRecycle.addItemDecoration(decoration)
    }
}