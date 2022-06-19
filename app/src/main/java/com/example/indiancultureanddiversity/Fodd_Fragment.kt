package com.example.indiancultureanddiversity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Fodd_Fragment : Fragment() {

    val food_data = arrayOf(
        FoodClass(21, "1. North Indian ", "– North India is the wheat " + "belt of the nation. The staple meal of" + "this region consists of rotis – unleavened\n" + "bread roasted over an open flame- with\n" + "an assortment of vegetable dishes,\n" +
                "lentils, curd and pickles. While some" + "parts of Northern India have people who " + "love their meat, there is also a section of " + "society which is purely vegetarian. They\n" + "get their protein from milk, curd and\n" + "cottage cheese, all of which are heavily\n" + "consumed in this region",R.drawable.north_indian_food ),
        FoodClass(22, "2. Eastern Indian Food ", "Eastern Indians are\n" + "primarily non-vegetarians, with fish\n" + "being a very popular ingredient. Food\n" +
                 "flavors are simple and majority of the dishes have a runny consistency", R.drawable.easter_india_food),
        FoodClass(23, "3. Western india Food", "– Western India is largely desert land. The climate being dry and arid, the food here is cooked\n" + "with minimum water. Use of lentils is widespread in this region, vegetables less so, as not much produce grows\n" +
                "here. Lentils in the form of dal - spiced lentil gravy - are as popular as dishes made of ground lentils.", R.drawable.west_indian_food),
        FoodClass(24, "4. South Indian Food", "Food in Southern India is mostly steamed or roasted. Rice is the basis of every meal and is\n" + "usually served with a thin soup called rasam and a spicy lentil gravy called sambar. Tamarind, curd and coconut\n" + "are three ingredients used generously in most South Indian foods. All foods of this region are heavily flavored\n" +
                "with curry leaves, a fragrant herb native to this region", R.drawable.south_indian_food)
    )
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                                                            savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fodd_, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyl_ref = view.findViewById<RecyclerView>(R.id.food_container)

        recyl_ref.apply{
            layoutManager = LinearLayoutManager(activity)
            adapter = FoodAdapter()
        }
        (recyl_ref.adapter as FoodAdapter).foodData = food_data

    }
}