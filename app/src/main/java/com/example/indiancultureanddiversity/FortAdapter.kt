package com.example.indiancultureanddiversity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FortAdapter():RecyclerView.Adapter<FortAdapter.MyViewHolder>() {

    var fort_data = arrayOf<FortClass>()
        set(value){
            field = value;
            notifyDataSetChanged()
        }

    inner class MyViewHolder(view: View):RecyclerView.ViewHolder(view){

        val imag = view.findViewById<ImageView>(R.id.fort_image)
        val nm = view.findViewById<TextView>(R.id.fort_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FortAdapter.MyViewHolder {
        val item = LayoutInflater.from(parent.context).inflate(R.layout.fort_layout_for_fort, parent, false)

        return MyViewHolder(item)
    }

    override fun onBindViewHolder(holder: FortAdapter.MyViewHolder, position: Int) {
        with(holder){
            imag.setImageResource(fort_data[position].fortImage)
            nm.text = fort_data[position].fortName
        }
    }

    override fun getItemCount(): Int {
        return fort_data.size
    }
}