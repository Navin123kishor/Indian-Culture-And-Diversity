package com.example.indiancultureanddiversity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class DressAdapter() : RecyclerView.Adapter<DressAdapter.MyViewHolder>() {

    var dressData = arrayOf<DressClass>()
        set(value){
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemview = LayoutInflater.from(parent.context).inflate(R.layout.dress_layout_for_dress_fragment, parent, false)
         return MyViewHolder(itemview)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        with(holder){
            image.setImageResource(dressData[position].dress_image)
            name.text = dressData[position].dress_name
            descp.text = dressData[position].dress_descp
        }

    }

    inner class MyViewHolder( itemview: View): RecyclerView.ViewHolder(itemview){

        val image = itemView.findViewById<ImageView>(R.id.image_dress_layout)
        val name = itemView.findViewById<TextView>(R.id.Dress_name)
        val descp = itemView.findViewById<TextView>(R.id.dress_text)
    }

    override fun getItemCount(): Int {
         return dressData.size
    }

}
