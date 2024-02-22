package com.hfad.florafolio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class LavenderFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_lavender, container, false)

        // Find the TextView by ID
        val dynamicTextView: TextView = view.findViewById(R.id.dynamicTextView)

        // Set the text dynamically
        dynamicTextView.text = "Lavender (genus Lavandula) is a popular and aromatic herb known for its fragrant flowers and various uses.\n" +
                " Lavender is well-suited for cultivation in areas with well-drained soil and plenty of sunlight. It is a hardy plant and is often grown in gardens, borders, or as ornamental plants in landscaping." +
                "\n\n Aromatherapy: Lavender essential oil is known for its calming and soothing properties. It is often used in aromatherapy to promote relaxation and alleviate stress.\n" +
                " Culinary: Some lavender varieties are used in culinary applications, adding a subtle floral flavor to dishes and desserts. However, not all lavender is suitable for consumption, so it's important to use varieties specifically labeled as culinary lavender.\n" +
                " Medicinal: Lavender has been used in traditional medicine for its potential anti-inflammatory and antimicrobial properties. Symbolism: Lavender is often associated with calmness, purity, and devotion. It has been used in various cultures for its symbolic and medicinal significance. Some well-known lavender varieties include Lavandula angustifolia (English lavender), Lavandula x intermedia (Lavandin), and Lavandula stoechas (Spanish lavender). Lavender is not only appreciated for its beauty but also for its versatility in various applications, making it a beloved plant in gardens and households worldwide."

        return view
    }
}

