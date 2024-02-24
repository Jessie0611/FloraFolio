package com.hfad.florafolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.fragment.app.Fragment

import androidx.navigation.Navigation

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val navController =
            Navigation.findNavController(requireView())

        when (item.itemId) {
            R.id.HomeFragment -> {
                navController.navigate(R.id.HomeFragment)
                return true
            }

            R.id.AccountFragment -> {
                navController.navigate(R.id.AccountFragment)
                return true
            }

            R.id.signupFragment -> {
                navController.navigate(R.id.signupFragment)
                return true
            }

            R.id.RoseFragment -> {
                navController.navigate(R.id.RoseFragment)
                return true
            }

            R.id.LavenderFragment -> {
                navController.navigate(R.id.LavenderFragment)
                return true
            }

            else -> return super.onOptionsItemSelected(item)
        }
    }
}