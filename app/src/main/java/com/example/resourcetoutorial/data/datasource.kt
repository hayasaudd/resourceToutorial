package com.example.resourcetoutorial.data

import com.example.resourcetoutorial.R
import com.example.resourcetoutorial.model.affirmation

class datasource {
fun loadafirmation(): List<affirmation>{


       return listOf<affirmation>(
               affirmation(R.string.affirmation1),
               affirmation(R.string.affirmation2),
               affirmation(R.string.affirmation3),
               affirmation(R.string.affirmation4),
               affirmation(R.string.affirmation5),
               affirmation(R.string.affirmation6),
               affirmation(R.string.affirmation7) )

}
}