package com.example.indiancultureanddiversity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ReligionFragment : Fragment() {

    val religion_Data = arrayOf(
        ReligionClass(41, "1. Hinduism ", R.drawable.hinduism_culture, "Hinduism is the oldest religion in the world. Hinduism is world's third largest religion after Christianity and" +
                "Islam. Hinduism is the dominant religion in India, where Hindus form about 84 per cent of the total population." + "Hinduism is also known as \"Sanatan Dharma\" or the everlasting religion."),
        ReligionClass(42,"2. Budhism ", R.drawable.budhism, "At present Buddhism is one of the major world religions. The philosophy of Buddhism is based on the teachings\n" +
                "of Lord Buddha, Siddhartha Gautama (563 and 483 BC), a royal prince of Kapilvastu, India."),
        ReligionClass(43, "3. Jainism ", R.drawable.jain_dharm, "Jains form less than one percent of the Indian population. For centuries, Jains are famous as community of" +
                "traders and merchants. The states of Gujarat and Rajasthan have the highest concentration of Jain population" + "in India. The Jain religion is traced to Vardhamana Mahavira (The Great Hero 599-527 B.C.)."),
        ReligionClass(44, "4. Sikhism", R.drawable.sikhism_culture, "Sikhs form about 2 per cent of Indian population. In comparison to other religions, Sikhism is a younger" +
                "religion. The word 'Sikh' means a disciple and thus Sikhism is essentially the path of discipleship."),
        ReligionClass(45, "5. Islam", R.drawable.islam_culture, "One of the prominent religions of India, Islam forms about 12 per cent of India's population. Though India's " +
                "contact with Islam had begun much earlier, the real push came in the 8th century when the province of Sindh" + "was conquered."),
        ReligionClass(46, "6. Christian", R.drawable.christian_culture, "Christianity is one of the prominent religions in India. At present there are about 25 million Christians in India. " +
                "It is interesting to note that the Christian population in India is more than the entire population of Australia " + "and New Zealand")
    )
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                                                         savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_religion, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recylerview_ref = view.findViewById<RecyclerView>(R.id.Religion_Container).apply{
            layoutManager = LinearLayoutManager(activity)
            adapter = ReligionAdapter()
        }
        (recylerview_ref.adapter as ReligionAdapter).religion_data = religion_Data
    }
}