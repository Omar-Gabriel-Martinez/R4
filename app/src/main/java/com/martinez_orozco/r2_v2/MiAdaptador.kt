package com.martinez_orozco.r2_v2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MiAdaptador(private val datos: List<String>) :
    RecyclerView.Adapter<MiAdaptador.ItemViewHolder>() {

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textoItem: TextView = view.findViewById(R.id.texto_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val vista = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_lista, parent, false)
        return ItemViewHolder(vista)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.textoItem.text = datos[position]
    }

    override fun getItemCount() = datos.size
}