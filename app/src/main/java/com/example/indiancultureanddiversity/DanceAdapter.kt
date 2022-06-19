package com.example.indiancultureanddiversity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DanceAdapter() :RecyclerView.Adapter<DanceAdapter.MyViewHolder>(){

    var danceData = arrayOf<DanceClass>()
        set(value){
            field = value
            notifyDataSetChanged()
        }

    inner class MyViewHolder(itemview: View): RecyclerView.ViewHolder(itemview){

        val image = itemview.findViewById<ImageView>(R.id.dance_image)
        val dance_name = itemview.findViewById<TextView>(R.id.dance_name)
        val dance_Descp = itemview.findViewById<TextView>(R.id.dance_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DanceAdapter.MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.dance_layout_for_dancefragment, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: DanceAdapter.MyViewHolder, position: Int) {
        with(holder){
            image.setImageResource(danceData[position].danceImage)
            dance_name.text = danceData[position].danceName
            dance_Descp.text = danceData[position].danceDescp
        }
    }

    override fun getItemCount(): Int {
        return danceData.size
    }
}