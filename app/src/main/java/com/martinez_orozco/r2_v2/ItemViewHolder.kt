package com.martinez_orozco.r2_v2

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val textoItem: TextView = view.findViewById(R.id.texto_item)
}
