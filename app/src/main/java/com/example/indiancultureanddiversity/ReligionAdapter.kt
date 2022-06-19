package com.example.indiancultureanddiversity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ReligionAdapter():RecyclerView.Adapter<ReligionAdapter.MyViewHolder>() {

    var religion_data = arrayOf<ReligionClass>()
        set(value){
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReligionAdapter.MyViewHolder {
         val item = LayoutInflater.from(parent.context).inflate(R.layout.religion_layout_for_religion, parent, false)
         return MyViewHolder(item)
    }

    inner class MyViewHolder(view : View):RecyclerView.ViewHolder(view){
        val image = view.findViewById<ImageView>(R.id.religion_image)
        val religionname = view.findViewById<TextView>(R.id.religion_name)
        val descp = view.findViewById<TextView>(R.id.religion_text)

    }


    override fun onBindViewHolder(holder: ReligionAdapter.MyViewHolder, position: Int) {
        with(holder){
            image.setImageResource(religion_data[position].religionImage)
            religionname.text = religion_data[position].religionName
            descp.text = religion_data[position].religionDescp
        }
    }

    override fun getItemCount(): Int {
        return religion_data.size
    }
}