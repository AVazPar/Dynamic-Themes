package com.avazpar.dynamicThemes

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter (private val mDataSet: List<String>)
    : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    // En este ejemplo cada elemento consta solo de un nombre
    class ViewHolder(var textView: TextView) : RecyclerView.ViewHolder(textView)

    // El layout manager invoca este método para renderizar cada elemento
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_investment, parent, false) as TextView

        // Aquí podemos definir tamaños, márgenes, paddings, etc
        return ViewHolder(v)
    }

    // Este método asigna valores para cada elemento de la lista
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = mDataSet[position]
    }

    // Cantidad de elementos del RecyclerView
    // Puede ser más complejo (por ejm, si implementamos filtros o búsquedas)
    override fun getItemCount() = mDataSet.size
}
