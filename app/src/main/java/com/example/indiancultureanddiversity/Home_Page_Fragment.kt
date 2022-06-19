package com.example.indiancultureanddiversity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class Home_Page_Fragment : Fragment() {


    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?,
                                                                 savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home__page_, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val continue_butt = view.findViewById<Button>(R.id.continue_button)
         continue_butt.setOnClickListener {
             findNavController().navigate(R.id.action_home_Page_Fragment_to_listOfDiversityFragment)
         }
    }
}