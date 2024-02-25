package com.hfad.florafolio

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment

import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.navigation.NavigationView

class HomeFragment : Fragment(R.layout.fragment_home) {
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.main_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }
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
