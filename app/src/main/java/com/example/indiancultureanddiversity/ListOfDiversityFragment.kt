package com.example.indiancultureanddiversity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListOfDiversityFragment : Fragment() {

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?,
                                                             savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_of_diversity, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyl_view_ref = view.findViewById<RecyclerView>(R.id.main_container)
         recyl_view_ref.apply{
             layoutManager = LinearLayoutManager(activity)
             adapter = List_Adapter{
                 val bundle = Bundle()
                 bundle.putInt("ID", it.divrersity_id)

                 findNavController().navigate(R.id.action_listOfDiversityFragment_to_detail_Of_Culture_Fragment, bundle)
             }
             setHasFixedSize(true);
         }
        (recyl_view_ref.adapter as List_Adapter).submitList(diversity_item)
    }
}