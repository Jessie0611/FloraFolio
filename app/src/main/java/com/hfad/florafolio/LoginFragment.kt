package com.hfad.florafolio

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.navigation.fragment.findNavController

class LoginFragment : Fragment() {

    // Define your views here
    private lateinit var emailAddressEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var forgotPWButton: Button
    private lateinit var signUpButton: Button
    private lateinit var loginButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        signUpButton = view.findViewById<Button>(R.id.signUp)
        loginButton = view.findViewById<Button>(R.id.loginButton)
        signUpButton.setOnClickListener {
            findNavController().navigate(R.id.signupFragment)        }
        loginButton.setOnClickListener {
            findNavController().navigate(R.id.accountFragment)        }

    }
}
