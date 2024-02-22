package com.hfad.florafolio

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class AccountFragment : Fragment() {

    private lateinit var uploadPlantButton: Button
    private lateinit var imageView: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_account, container, false)
        val helloTextView: TextView = view.findViewById<EditText>(R.id.emailAddress)
        uploadPlantButton = view.findViewById(R.id.button2)
        imageView = view.findViewById(R.id.imageView)

        helloTextView.text = getString(R.string.hello_name)


        // Set click listener for the upload plant button if needed
        uploadPlantButton.setOnClickListener {
            // Handle button click here
        }

        return view
    }
}
