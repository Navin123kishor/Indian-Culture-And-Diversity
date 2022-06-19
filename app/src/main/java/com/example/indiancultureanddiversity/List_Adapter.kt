package com.example.indiancultureanddiversity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class List_Adapter(private val listener : (Item)-> Unit) : ListAdapter<Item, List_Adapter.MyViewHolder>(DiffCallback()){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemlayout = LayoutInflater.from(parent.context).inflate(R.layout.items_layout, parent, false)

        return MyViewHolder(itemlayout)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.bind( getItem(position))
    }

    inner class MyViewHolder(itemview: View):RecyclerView.ViewHolder( itemview){

        init{
            itemView.setOnClickListener{
                listener.invoke(getItem(adapterPosition))
            }
        }

        fun bind( itemdata : Item){
            with(itemdata){

                val image = itemView.findViewById<ImageView>(R.id.item_layout_image)
                image.setImageResource(this.diversity_image)

                val descp = itemView.findViewById<TextView>(R.id.item_descp_in_List)
                descp .text = this.diversity_name
            }
        }
    }
    class DiffCallback : DiffUtil.ItemCallback<Item>() {
        override fun areItemsTheSame(oldItem: Item, newItem: Item): Boolean {
            return oldItem.divrersity_id == newItem.divrersity_id
        }

        override fun areContentsTheSame(oldItem: Item, newItem: Item): Boolean {
            return oldItem == newItem
        }
    }
}

