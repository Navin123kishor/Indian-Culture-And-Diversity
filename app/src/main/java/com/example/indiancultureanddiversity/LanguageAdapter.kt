package com.example.indiancultureanddiversity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LanguageAdapter(): RecyclerView.Adapter<LanguageAdapter.MyViewHolder>() {

    var language_data = arrayOf<LangaugeClass>()
        set(value){
            field =  value
            notifyDataSetChanged()
        }

    inner class MyViewHolder(view: View):RecyclerView.ViewHolder(view){

        val lang_img = view.findViewById<ImageView>(R.id.language_image)
        val lang_name = view.findViewById<TextView>(R.id.language_name)
        val lang_descp = view.findViewById<TextView>(R.id.language_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageAdapter.MyViewHolder {

        val item = LayoutInflater.from(parent.context).inflate(R.layout.language_layout_for_languagefragment, parent, false)
        return MyViewHolder(item)
    }

    override fun onBindViewHolder(holder: LanguageAdapter.MyViewHolder, position: Int) {
        with(holder){
            lang_img.setImageResource(language_data[position].LangImage)
            lang_name.text = language_data[position].langName
            lang_descp.text = language_data[position].langDesp
        }
    }

    override fun getItemCount(): Int {
        return language_data.size
    }
}