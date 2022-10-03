package com.reyndev.scrollablelist.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.reyndev.scrollablelist.R
import com.reyndev.scrollablelist.model.StringItem

class ItemAdapter(
    val context: Context,
    val dataset: List<StringItem>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val tvItemTitle: TextView = view.findViewById(R.id.tvItemTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.tvItemTitle.text = context.resources.getString(item.stringResId)
    }

    override fun getItemCount() = dataset.size
}