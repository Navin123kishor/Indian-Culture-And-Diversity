package com.example.indiancultureanddiversity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FoodAdapter(): RecyclerView.Adapter<FoodAdapter.MyViewHolder>() {

    var foodData = arrayOf<FoodClass>()
        set(value){
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodAdapter.MyViewHolder {

        val itemview = LayoutInflater.from(parent.context).inflate(R.layout.food_layout_forfood_fragment, parent, false)
        return MyViewHolder(itemview)
    }

    override fun onBindViewHolder(holder: FoodAdapter.MyViewHolder, position: Int) {
        with(holder){
            image.setImageResource(foodData[position].foodImage)
            name.text = foodData[position].foodName
            descp.text = foodData[position].fooddescp
        }

    }

    inner class MyViewHolder( itemview: View): RecyclerView.ViewHolder(itemview){

        val image = itemView.findViewById<ImageView>(R.id.food_image)
        val name = itemView.findViewById<TextView>(R.id.food_name)
        val descp = itemView.findViewById<TextView>(R.id.food_text)
    }

    override fun getItemCount(): Int {
        return foodData.size
    }

}