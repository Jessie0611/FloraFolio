package com.hfad.florafolio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class AccountFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_account, container, false)

        // Access UI elements and set their properties

        val uploadPlantButton: Button = view.findViewById(R.id.button2)
        // Set an OnClickListener for the button to handle the upload action

        val plantImageView: ImageView = view.findViewById(R.id.imageView)
        // Set an image resource or load an image for the plant

        return view
    }
}
