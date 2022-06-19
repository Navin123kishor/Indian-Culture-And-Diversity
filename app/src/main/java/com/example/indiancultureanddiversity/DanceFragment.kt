package com.example.indiancultureanddiversity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DanceFragment : Fragment() {

    val dance_Data = arrayOf(
        DanceClass(31, "1. Kathak", R.drawable.kathak_dance, "State : Uttar Pradesh\n" +
                "The word Kathak is originated from the word Katha which means storytelling. Traditionally this dance was" + "more religious in nature, typically narrating the stories of Radha and Krishna. The dancers dance to the rhythm" + "of table or pakhawaj."),
        DanceClass(32, "2. Odissi", R.drawable.odissi_dance, "State : Odisha\n" +
                "Performed by ‘Maharis’ or female temple servants, this dance form have a close association with the temples" + "and temple sculptures. Odissi stands out from other forms of dances because of its Tribhangi posture, dealing" + "with three body parts, i.e. head, bust, and torso."),
        DanceClass(33, "3. Manipuri", R.drawable.manipuri_dance, " State : Manipur\n" +
                "Manipuri dance is one of the famous dances of India. The main characteristics of this dance are colorful" + "decoration and costumes, charming music, gentle and swaying petal-soft foot movements and delicacy of" + "performance."),
        DanceClass(34, "4. Sattriya", R.drawable.sattriya_dance, " State : Assam\n" +
                "When you are on your Assam tour, make it a point to watch this traditional Indian dance. It is an art which" + "represents dance-drama performances with a unique combination of hand gestures, footwork, expressions," + "and body movements."),
        DanceClass(35, "5. Bharatnatyam", R.drawable.bharatanatyam_dance, " State: Tamil Nadu and Karnataka\n" +
                "This Indian classical dance tops the list of famous dances of India. The centuries old dance teachers and" + "temple dancers hand over this beautiful dance form to us. It is a delightful combination of four elements i.e." + "expression, music, beats, and dance."),
        DanceClass(36, "6. Kathakali",R.drawable.kathakali_dance, "State : Kerala\n" +
                "Kathakali is another popular Indian dance form. Kathakali means story play; hence the stories of Ramayana" + "and Mahabharata act as a source for a lot of performances. This form of dance is known for its heavy, intense" + "makeup and costumes."),
        DanceClass(37, "7. Bhangra", R.drawable.bhangra_dance, "State: Punjab\n" +
                "Bhangra is one of the most popular folk dances of Punjab. Men folks perform this, especially during Baisakhi. It" + "is full of enthusiasm and energy. Men are dressed in lungis and colorful turbans."),
        DanceClass(38, "8. Sirmournati", R.drawable.sirmour_nati_dance, "State: Himachal Pradesh\n" +
                "Sirmour Nati is a popular folk dance in the North. Traditionally this dance was performed for 4 to 5 hours and" + "wouldn’t stop till the performers and musicians are exhausted."),
        DanceClass(39, "9. Dandiya" ,R.drawable.dandiya_dance, "| State: Gujarat\n" +
                "another energetic and enthusiastic dance of Gujarat is Dandiya. Performers dance with the help of sticks in " + "hands. These sticks (dandiyas) represent swords of Goddess Durga.")
    )
    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?,
                                                            savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dance, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recylervire_ref = view.findViewById<RecyclerView>(R.id.Dance_container).apply{
            layoutManager = LinearLayoutManager(activity)
            adapter = DanceAdapter()
        }
        (recylervire_ref.adapter as DanceAdapter).danceData = dance_Data
    }
}