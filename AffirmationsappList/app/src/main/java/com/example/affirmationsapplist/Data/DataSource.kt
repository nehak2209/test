package com.example.affirmationsapplist.Data

import com.example.affirmationsapplist.R
import com.example.affirmationsapplist.model.Affirmation

class DataSource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.Affirmation1 ,R.drawable.image1),
            Affirmation(R.string.Affirmation2 , R.drawable.image2),
            Affirmation(R.string.Affirmation3 , R.drawable.image3),
            Affirmation(R.string.Affirmation4 , R.drawable.image4),
            Affirmation(R.string.Affirmation5 , R.drawable.image5),
            Affirmation(R.string.Affirmation6 , R.drawable.image6 ),
            Affirmation(R.string.Affirmation7 , R.drawable.image7),
            Affirmation(R.string.Affirmation8 , R.drawable.image8),
            Affirmation(R.string.Affirmation9 , R.drawable.image9),
            Affirmation(R.string.Affirmation10 , R.drawable.image10)
        )
    }
}