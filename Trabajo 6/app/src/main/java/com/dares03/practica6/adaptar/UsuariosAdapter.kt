package com.dares03.practica6.adaptar

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dares03.practica6.Usuario
import com.dares03.practica6.R

class UsuariosAdapter(val items: List<Usuario>):RecyclerView.Adapter<UsuarioViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsuarioViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_usuario,parent,false)
        return UsuarioViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: UsuarioViewHolder, position: Int) {
        val item =items[position]
        holder.render(item)
        holder.clickRecycle()

    }
}