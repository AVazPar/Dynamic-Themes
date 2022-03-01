package com.avazpar.dynamicThemes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter (private val mDataSet: List<String>)
    : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(var cardView: CardView) : RecyclerView.ViewHolder(cardView) {
        val image: ImageView = cardView.findViewById(R.id.image)
        val title: TextView = cardView.findViewById(R.id.item_title)
        val amount: TextView = cardView.findViewById(R.id.item_amount)
        val description: TextView = cardView.findViewById(R.id.item_description)
        val detail: TextView = cardView.findViewById(R.id.item_detail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_investment, parent, false) as CardView

        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = mDataSet[position]
    }

    override fun getItemCount() = mDataSet.size
}
