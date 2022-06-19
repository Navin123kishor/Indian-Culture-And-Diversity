package com.example.indiancultureanddiversity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Fort_Monument_Fragment : Fragment() {

    val fort_Data = arrayOf(
        FortClass(61, "1. RedFort ", R.drawable.redfort_img),
        FortClass(62, "2. AmerFort ", R.drawable.amer_fort_),
        FortClass(63, "3. KangraFort ", R.drawable.kangra_fort),
        FortClass(64, "4. Chittorgarh Fort ", R.drawable.chittorgarh_fort),
        FortClass(65, "5. Jaisalmer Fort ", R.drawable.jaisalmer_fort),
        FortClass(66, "6. Gwalior Fort ", R.drawable.gwalior_fort),
        FortClass(67, "7. Taj Mahal ", R.drawable.taj_mahal),
        FortClass(68, "8. India gate ", R.drawable.india_gate_delhi),
        FortClass(69, "9. Golden Temple ", R.drawable.golden_temple),
        FortClass(70, "10. Hawa Mahal ", R.drawable.hawa_mahal),
        FortClass(71, "11. CharMinar ", R.drawable.charminar_hyderabad)
    )
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                                                          savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fort__monument_, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recycly_ref = view.findViewById<RecyclerView>(R.id.fort_container).apply{
            layoutManager = LinearLayoutManager(activity)
            adapter = FortAdapter()
        }
        (recycly_ref.adapter as FortAdapter).fort_data = fort_Data
    }
}