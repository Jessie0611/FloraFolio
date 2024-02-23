package com.hfad.florafolio

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.button.MaterialButton


class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)
        val toolbar = view.findViewById<MaterialToolbar>(R.id.toolbar)
        val loginButton = view.findViewById<MaterialButton>(R.id.loginButton)
        loginButton.setOnClickListener {
            findNavController().navigate(R.id.AccountFragment)
        }
        toolbar.setupWithNavController(findNavController())
        setHasOptionsMenu(true)

        return view
    }
}


