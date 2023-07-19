package com.example.project_practico_15

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.project_practico_15.databinding.ItemBinding

/*
[x] Implementar clase Adapter
[x] Heredar RecuclerView
[x] Creaciones de métodos: onCreateViewHolder, onBindViewHolder y getItemCount
[x] Crear class ViewHolder
[x] Heredad RecyclerView.ViewHolder a class ViewHolder
[x] Agregar constructor

 */
class Adapter: RecyclerView.Adapter<Adapter.ViewHolder>() {
val pokemones = mutableListOf<Pokemon>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return pokemones.size

    }
    class ViewHolder(binding: ItemBinding): RecyclerView.ViewHolder(binding.root){

    }
}
