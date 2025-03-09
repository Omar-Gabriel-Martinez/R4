package com.martinez_orozco.r2_v2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.airbnb.lottie.LottieAnimationView

class MiAdaptador(private val datos: List<Item>) :
    RecyclerView.Adapter<MiAdaptador.ItemViewHolder>() {

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textoItem: TextView = view.findViewById(R.id.texto_item)
        val lottieAnimation: LottieAnimationView = view.findViewById(R.id.lottieAnimation)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val vista = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_lista, parent, false)
        return ItemViewHolder(vista)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = datos[position] // Obtener el elemento actual

        holder.textoItem.text = item.nombre  // Asignar el nombre al TextView
        holder.lottieAnimation.setAnimation(item.animacion) // Cargar animación específica
        holder.lottieAnimation.playAnimation() // Iniciar la animación
    }

    override fun getItemCount() = datos.size
}