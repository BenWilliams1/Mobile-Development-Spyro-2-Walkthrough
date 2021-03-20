package com.example.spyro2100walkthrough.ui.walkthrough

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.spyro2100walkthrough.R

class WalkthroughFragment : Fragment() {

    private lateinit var walkthroughViewModel: WalkthroughViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        walkthroughViewModel =
            ViewModelProvider(this).get(WalkthroughViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_walkthrough, container, false)
        val textView: TextView = root.findViewById(R.id.text_walkthrough)
        walkthroughViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

}