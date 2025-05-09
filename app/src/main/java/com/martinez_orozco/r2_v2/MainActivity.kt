package com.martinez_orozco.r2_v2


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        // Lista con diferentes textos y animaciones
        val listaDeDatos = listOf(
            Item("January", R.raw.jan),  // Usa animaciones diferentes
            Item("February", R.raw.feb),
            Item("March", R.raw.march),
        )

        // Configurar RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MiAdaptador(listaDeDatos)
    }
}
