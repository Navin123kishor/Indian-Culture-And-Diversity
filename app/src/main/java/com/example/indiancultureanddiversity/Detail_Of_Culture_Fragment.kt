package com.example.indiancultureanddiversity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import java.nio.file.Files.find

class Detail_Of_Culture_Fragment : Fragment() {

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?,
                                                            savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail__of__culture_, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var prd: Item? = null
        val id = arguments?.getInt("ID");

        id?.let{
            prd = diversity_item.find{it.divrersity_id == id}
        }

        prd?.let{
            with(it){

                val image = view.findViewById<ImageView>(R.id.item_layout_image)
                image.setImageResource(this.diversity_image)

                val title = view.findViewById<TextView>(R.id.item_descp_in_List)
                title.text = this.diversity_name

                val descp = view.findViewById<TextView>(R.id.details_item_type_InDetailFragment)
                descp.text = this.diversity_descp

                val button = view.findViewById<Button>(R.id.explore_button)
                button.setOnClickListener {

                    when( this.divrersity_id ){

                        1 ->{
                            findNavController().navigate(R.id.dresses_Fragment)
                        }
                        2->{
                            findNavController().navigate(R.id.fodd_Fragment)
                        }
                        3->{
                            findNavController().navigate(R.id.danceFragment)
                        }
                        4->{
                            findNavController().navigate(R.id.religionFragment)
                        }
                        5->{
                            findNavController().navigate(R.id.languageFragment)
                        }
                        else ->{
                            findNavController().navigate(R.id.fort_Monument_Fragment)
                        }
                    }
                }
            }
        }
    }
}