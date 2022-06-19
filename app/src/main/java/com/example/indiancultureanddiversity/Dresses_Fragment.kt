package com.example.indiancultureanddiversity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Dresses_Fragment : Fragment() {
    val dress_data = arrayOf<DressClass>(
        DressClass(11, "1. HeadGear", "The cap and dupatta are the main headgears used by Indian men and women\n" +
                "respectively. Muslim men use a special type of cap known as 'Topi' to cover their\n" +
                "heads whereas turban, locally known as 'Pagadi' in Punjab, is an integral part of a\n" +
                "Sikh men.", R.drawable.headgear_as_indian_dress),
        DressClass(12, "2. Dhoti" ,"The dhoti is the masculine version of the sari. It is comprised of unstitched, lightweight cloth\n" +
                "that measures five yards. Indian men wear the dhoti wrapped around the waist and the legs,\n" +
                "knotting it around the waist. Its name varies according to the region of India.", R.drawable.dhoti_as_indian_dress),
        DressClass(13, "3. Kurta", "A kurta is a tunic-like shirt that extends to the knees. It has a loose fit and is often made of natural\n" +
                "fibers, making it ideal to wear in warm or humid weather. Many Indian men wear kurta s, often pairing\n" +
                "them with a pyjama, which is a lightweight trouser that has a drawstring waist.", R.drawable.kurta_as_indian_dress),
        DressClass(14, "4. Pashmina", "Pashmina wool shawls have been one of India's great crossover hits in Western fashion. These\n" +
                "richly dyed shawls feature a soft cashmere fabric, made from the wool that grows on the\n" +
                "Capra Hircus goat's underbelly", R.drawable.pasmina_indian_dress),
        DressClass(15, "5. Shirt Pant", "This  is modern Indian Mens Dressing ", R.drawable.shirt_pant_indian_dress),

        )

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                                                             savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dresses_, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyl_ref = view.findViewById<RecyclerView>(R.id.dress_container)
         recyl_ref.apply{
             layoutManager = LinearLayoutManager(activity)
             adapter = DressAdapter()
         }
        (recyl_ref.adapter as DressAdapter).dressData = dress_data
    }
}