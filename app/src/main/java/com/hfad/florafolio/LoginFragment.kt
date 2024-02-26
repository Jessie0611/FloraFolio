package com.hfad.florafolio

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.Button
import androidx.navigation.fragment.findNavController

class LoginFragment : Fragment() {
    private lateinit var signUpButton: Button
    private lateinit var loginButton: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        signUpButton = view.findViewById<Button>(R.id.signUp)
        loginButton = view.findViewById<Button>(R.id.logIn)

        signUpButton.setOnClickListener {
            findNavController().navigate(R.id.signupFragment)
        }

        loginButton.setOnClickListener {
            findNavController().navigate(R.id.accountFragment)
        }
    }
}
