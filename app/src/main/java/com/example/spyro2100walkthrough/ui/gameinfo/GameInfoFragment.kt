package com.example.spyro2100walkthrough.ui.gameinfo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.spyro2100walkthrough.R

class GameInfoFragment : Fragment() {

    private lateinit var gameInfoViewModel: GameInfoViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        gameInfoViewModel =
            ViewModelProvider(this).get(GameInfoViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_gameinfo, container, false)
        val textView: TextView = root.findViewById(R.id.text_gameinfo)
        gameInfoViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}