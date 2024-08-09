package com.example.techpro_admins_app.screens

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.techpro_admins_app.R
import com.example.techpro_admins_app.navigation.HomeFragment
import com.example.techpro_admins_app.navigation.Messages
import com.example.techpro_admins_app.navigation.ProfileFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val home_Fragment=HomeFragment()
        val profile_Fragment=ProfileFragment()
        val message_Fragment=Messages()

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        setCurrentFragment(home_Fragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home->setCurrentFragment(home_Fragment)
                R.id.profile->setCurrentFragment(profile_Fragment)
                R.id.messages->setCurrentFragment(message_Fragment)
            }
            true
        }
    }
    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }
}