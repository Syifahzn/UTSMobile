package com.example.recyclerview.data

import com.example.recyclerview.R
import com.example.recyclerview.model.Ikan_Hias

class Datasource() {
    fun loadIkan_Hias(): List<Ikan_Hias>{
        return listOf<Ikan_Hias>(
            Ikan_Hias(R.string.Ikan_Hias1, R.drawable.image1),
            Ikan_Hias(R.string.Ikan_Hias2, R.drawable.image2),
            Ikan_Hias(R.string.Ikan_Hias3, R.drawable.image3),
            Ikan_Hias(R.string.Ikan_Hias4, R.drawable.image4),
            Ikan_Hias(R.string.Ikan_Hias5, R.drawable.image5),
            Ikan_Hias(R.string.Ikan_Hias6, R.drawable.image6),
            Ikan_Hias(R.string.Ikan_Hias7, R.drawable.image7),
            Ikan_Hias(R.string.Ikan_Hias8, R.drawable.image8),
            Ikan_Hias(R.string.Ikan_Hias9, R.drawable.image9),
            Ikan_Hias(R.string.Ikan_Hias10, R.drawable.image10)
        )
    }
}