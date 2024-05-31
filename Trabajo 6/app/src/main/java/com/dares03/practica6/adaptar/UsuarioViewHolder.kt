package com.dares03.practica6.adaptar

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dares03.practica6.R
import com.dares03.practica6.Usuario

class UsuarioViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

    val viewNombre = itemView.findViewById<TextView>(R.id.txtNombre)
    val viewNumero = itemView.findViewById<TextView>(R.id.txtNumero)

    fun render(item:Usuario){
        viewNombre.text = item.nombre
        viewNumero.text = item.numero.toString()
    }
}