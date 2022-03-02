package com.avazpar.dynamicThemes.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.graphics.drawable.toDrawable
import androidx.recyclerview.widget.RecyclerView
import com.avazpar.dynamicThemes.R

class InvestmentAdapter (private val mDataSet: List<Investment>)
    : RecyclerView.Adapter<InvestmentAdapter.ViewHolder>() {

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
        holder.title.text = mDataSet[position].title
        holder.description.text = mDataSet[position].description
        holder.detail.text = mDataSet[position].detail
        holder.amount.text = mDataSet[position].amount

        when(mDataSet[position].category){
            InvestmentCategory.APPLE -> {
               holder.image.setImageResource(R.drawable.category01)
            }

            InvestmentCategory.TESLA -> {
                holder.image.setImageResource(R.drawable.category02)
            }

            InvestmentCategory.GOOGLE -> {
                holder.image.setImageResource(R.drawable.category03)
            }
            else -> {

            }
        }
    }

    override fun getItemCount() = mDataSet.size
}
