package com.example.viewpagerloginsign.fragments
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.viewpagerloginsign.databinding.FragmentAuthBinding

class AuthFragment : Fragment() {

    private var binding: FragmentAuthBinding? = null
    private var login: String? = null
    private var password: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        login = arguments?.getString("login")
        password = arguments?.getString("password")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAuthBinding.inflate(layoutInflater,container, false)
        return binding?.root
    }

}


