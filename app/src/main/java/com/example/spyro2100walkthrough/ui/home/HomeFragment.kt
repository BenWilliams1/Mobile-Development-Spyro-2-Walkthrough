package com.example.spyro2100walkthrough.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.spyro2100walkthrough.CharacterInfoFragment
import com.example.spyro2100walkthrough.GlimmerWalkthrough
import com.example.spyro2100walkthrough.R


class HomeFragment: Fragment(), View.OnClickListener  {

    private lateinit var homeViewModel: HomeViewModel
    var navController: NavController ?= null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
            homeViewModel =
                ViewModelProvider(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.testbutton1)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.testbutton2)?.setOnClickListener(this)
    }

        override fun onClick(v: View?){
            when (v?.id)
            {
                R.id.testbutton1->{
                    navController?.navigate(R.id.test_to_charinfo)
                }

                R.id.testbutton2->{
                    navController?.navigate(R.id.home_to_glimmer)
                }
            }

        }
}

