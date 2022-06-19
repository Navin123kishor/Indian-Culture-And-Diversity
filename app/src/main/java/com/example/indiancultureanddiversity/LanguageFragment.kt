package com.example.indiancultureanddiversity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class LanguageFragment : Fragment() {

    val lang_data = arrayOf(
        LangaugeClass(51, "1. HINDI ", R.drawable.hindi_language, "Hindi (Devanagari: हिन्दी), or more precisely Modern Standard Hindi (Devanagari: मानक हिन्दी), is an Indo-Aryan language spoken chiefly in the Hindi Belt region encompassing parts of northern, central, eastern and western India. Hindi has been described as a standardised and Sanskritised register of the Hindustani language. "),
        LangaugeClass(52, "2. English", R.drawable.english_language, "Indian English is a group of English dialects spoken in India and among the Indian diaspora. English is used by the Indian government for communication, along with Hindi as enshrined in the Constitution. English is an official language of 7 states and 5 Union Territories and also an additional official language of 7 states and 1 Union Territory."),
        LangaugeClass(53, "3. Urdu ", R.drawable.urdu_language, "Urdu is officially recognised in India and has official status in the National Capital Territory of Delhi to which the language has remained deeply attached through its medieval history of Muslim sultanates and empires and the Indian states and union territories of Uttar Pradesh, Bihar, Telangana and Jammu and Kashmir."),
        LangaugeClass(54, "4. Tamil", R.drawable.tamil_language, "Tamil is a classical Dravidian language natively spoken by the Tamil people of South Asia. Tamil is an official language of the Indian state of Tamil Nadu, the sovereign nations of Sri Lanka and Singapore, and the Union Territory of Puducherry. "),
        LangaugeClass(55, "5. Telugu", R.drawable.telugu_language, "Telugu is a Dravidian language spoken by Telugu people predominantly living in the Indian states of Andhra Pradesh and Telangana, where it is also the official language. It is the most spoken Dravidian language and one of the few languages that has primary official status in more than one Indian state."),
        LangaugeClass(56, "6. Marathi ", R.drawable.marathi_language, "Marathi is an Indo-Aryan language predominantly spoken by Marathi people in the Indian state of Maharashtra. It is the official language of Maharashtra, and a co-official language in Goa state and the territory of Damaon, Diu & Silvassa. It is one of the 22 scheduled languages of India."),
        LangaugeClass(57, "7. Bangali", R.drawable.bengali_language, "Bengali also known by  Bangla , is an Indo-Aryan language native to the Bengal region of South Asia. It is the official, national, and most widely spoken language of Bangladesh and the second most widely spoken of the 22 scheduled languages of India.")
    )
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                                                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_language, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recycler_ref = view.findViewById<RecyclerView>(R.id.language_container).apply{
            layoutManager = LinearLayoutManager(activity)
            adapter = LanguageAdapter()
        }
        (recycler_ref.adapter as LanguageAdapter).language_data = lang_data
    }
}