package com.example.spyro2100walkthrough.ui.levels.autumn_plains

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.spyro2100walkthrough.R

class FractureHillsFragment : Fragment(), View.OnClickListener {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.fracture_hills_video_button)?.setOnClickListener(this)
    }

    override fun onClick(v: View?){
        when (v?.id) {
            R.id.fracture_hills_video_button -> {
                val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=JZLo0hoJMCk"))
                startActivity(i)
            }

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fracture_hills, container, false)
    }
}