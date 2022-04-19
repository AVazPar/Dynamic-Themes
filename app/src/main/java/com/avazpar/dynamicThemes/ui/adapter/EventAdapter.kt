package com.avazpar.dynamicThemes.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.avazpar.dynamicThemes.R

class EventAdapter (private val mDataSet: List<Event>)
    : RecyclerView.Adapter<EventAdapter.ViewHolder>() {

    class ViewHolder(var cardView: ConstraintLayout) : RecyclerView.ViewHolder(cardView) {
        val image: ImageView = cardView.findViewById(R.id.image)
        val title: TextView = cardView.findViewById(R.id.item_title)
        val description: TextView = cardView.findViewById(R.id.item_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_investment, parent, false) as ConstraintLayout

        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = mDataSet[position].title
        holder.description.text = mDataSet[position].description

        when(mDataSet[position].category){
            EventCategory.PERSONAL -> {
               holder.image.setImageResource(R.drawable.category01)
            }

            EventCategory.HOUSE -> {
                holder.image.setImageResource(R.drawable.category02)
            }

            EventCategory.HOGWARTS -> {
                holder.image.setImageResource(R.drawable.category03)
            }
        }
    }

    override fun getItemCount() = mDataSet.size
}
