package com.hfad.florafolio

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.appbar.MaterialToolbar

class LavenderFragment : Fragment() {
        private lateinit var toolbar: MaterialToolbar
        private lateinit var imageView: ImageView
        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            val view = inflater.inflate(R.layout.fragment_lavender, container, false)
            toolbar = view.findViewById(R.id.toolbar)
            imageView = view.findViewById(R.id.imageViewLav)
            val collapsingToolbarLayout: CollapsingToolbarLayout = view.findViewById(R.id.collapsingToolbarLayout)
            val appBarLayout: AppBarLayout = view.findViewById(R.id.appBarLayout)

            collapsingToolbarLayout.title = "Lavender"
            appBarLayout.addOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener { _, verticalOffset ->
                // Handle toolbar behavior if needed
            })

            return view
        }
    }