package com.severianfw.foodapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class FoodListAdapter(private val listFood: ArrayList<Food>) : RecyclerView.Adapter<FoodListAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_food_name)
        var tvDesc: TextView = itemView.findViewById(R.id.tv_desc)
        var imgFood: ImageView = itemView.findViewById(R.id.item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_food, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val food = listFood[position]

        Glide.with(holder.itemView)
            .load(food.img)
            .apply(RequestOptions().override(80, 80))
            .into(holder.imgFood)

        holder.itemView.setOnClickListener() {
            onItemClickCallback.onItemClicked(listFood[holder.adapterPosition])
        }
        holder.tvName.text = food.name
        holder.tvDesc.text = food.desc
    }

    override fun getItemCount(): Int {
        return listFood.size
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(food: Food)
    }

}