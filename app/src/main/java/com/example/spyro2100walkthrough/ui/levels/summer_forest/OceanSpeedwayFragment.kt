package com.example.spyro2100walkthrough.ui.levels.summer_forest

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.spyro2100walkthrough.R

class OceanSpeedwayFragment : Fragment(), View.OnClickListener {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.ocean_speedway_video_button)?.setOnClickListener(this)
    }

    override fun onClick(v: View?){
        when (v?.id) {
            R.id.ocean_speedway_video_button -> {
                val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=u0C-ZZUm9qY"))
                startActivity(i)
            }

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ocean_speedway, container, false)
    }

}