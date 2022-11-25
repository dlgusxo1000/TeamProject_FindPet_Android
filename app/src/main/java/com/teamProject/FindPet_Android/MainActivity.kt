package com.findpet_android.TeamProject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.teamProject.FindPet_Android.R
import kotlinx.android.synthetic.main.activity_main.*

lateinit var navController: NavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar: ActionBar? = supportActionBar
        if (actionBar != null) {
            actionBar.hide()
        }

//        navController = nav_host_fragment.findNavController()
//        navController = findNavController(R.id.nav_host_fragment)
        var navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        var navController = navHostFragment.navController
    }
}