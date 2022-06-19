package com.example.indiancultureanddiversity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

val diversity_item =  mutableListOf<Item>(
           Item( 1, R.drawable.traditional_indian_dresses_1, "Indian Dressing And Fashion",
               "Indian have Large Diversity in Dressing sense .It differ from region to region . This difference is due to social as well as geographical aspect of society "),
           Item(2, R.drawable.indian_food_culture, "Indian Food And Recipies",
               "Indian is Rich in Food. Food and Diversity in India has grown with its civilization . Some food Item came from others countries and some were originated in India."),
           Item( 3, R.drawable.indian_dance, "indian Traditional Dance",
               "Indian Dance , woww!!. it has been part of Indian Society as entertainment as well as part of passion. Indian Dance changes with places to places , but all dances are Amazing."),
           Item( 4, R.drawable.indian_religios_culture, "Indina Religious",
               "unity in Diversity ,it is a famous phrase ,often called for India yeah ,its True. In India ,HINDU ,MUSLIM ,SIKH ,ISAI, BODH, JAIN etc. religion are found."),
           Item( 5,R.drawable.indian_language ,"indian  Langauge",
               "India have two Language as official Language , but the Indian constitution recognizes 22 major languages of India"),
           Item(6, R.drawable.indian_forts_and_palaces, "Indian Forts And Palaces",
               "India has very long History ,so it effect is that , a lots of Forts and monuments were constructed . eg Red Fort, TajMahala, Suryamandir, Hawamahal . These are parts of National heritage .")
)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}