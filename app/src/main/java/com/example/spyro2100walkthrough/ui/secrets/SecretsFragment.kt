package com.example.spyro2100walkthrough.ui.secrets

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.spyro2100walkthrough.R

class SecretsFragment : Fragment() {

    private lateinit var secretsViewModel: SecretsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        secretsViewModel =
            ViewModelProvider(this).get(SecretsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_secrets, container, false)
        val textView: TextView = root.findViewById(R.id.text_secrets)
        secretsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}