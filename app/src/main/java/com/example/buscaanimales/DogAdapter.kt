package com.example.buscaanimales

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DogAdapter(private val images: List<String>) : RecyclerView.Adapter<DogViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return DogViewHolder(layoutInflater.inflate(R.layout.item_dog, parent, false))
    }

    override fun getItemCount(): Int = images.size


    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        val item = images[position]
        holder.bind(item)
    }
}