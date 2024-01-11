package com.example.viewpagerloginsign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpagerloginsign.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val adapter = FragmentStateAdapter(supportFragmentManager, lifecycle)
        binding?.myViewPager2?.adapter = adapter

        val mediator = TabLayoutMediator(binding!!.myTab, binding!!.myViewPager2){
            tab, position ->
            when(position){
                0 -> tab.text = "Log In"
                1 -> tab.text = "Sign up"
            }
        }
        mediator.attach()
    }
}