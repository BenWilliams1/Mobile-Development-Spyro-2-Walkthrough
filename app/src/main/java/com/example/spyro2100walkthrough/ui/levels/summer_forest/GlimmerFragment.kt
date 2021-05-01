package com.example.spyro2100walkthrough.ui.levels.summer_forest

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.MediaController
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.spyro2100walkthrough.R
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerSupportFragment
import com.google.android.youtube.player.YouTubeStandalonePlayer

class GlimmerFragment : Fragment(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //There was an attempt with the youtube api

      // val youtubefragment = childFragmentManager.findFragmentById(R.id.youtube_fragment)
      //         as YouTubePlayerSupportFragment

      // youtubefragment.initialize("AIzaSyAHzlptX2XWU_V_-L-9OEipCr58W6KaTmU", object: YouTubePlayer.OnInitializedListener{
      //     override fun onInitializationSuccess(
      //         provider: YouTubePlayer.Provider?,
      //         player: YouTubePlayer?,
      //         wasRestored: Boolean
      //     ) {
      //         if(player == null)return
      //         if(wasRestored)
      //         {
      //             player.play()
      //         }
      //         else{
      //             player.cueVideo("K4b1YGEI-Fw")
      //             player.setPlayerStyle(YouTubePlayer.PlayerStyle.DEFAULT)
      //         }
      //     }

      //     override fun onInitializationFailure(
      //         p0: YouTubePlayer.Provider?,
      //         p1: YouTubeInitializationResult?
      //     ) {
      //         TODO("Not yet implemented")
      //     }

      // })
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.glimmer_video_button)?.setOnClickListener(this)
    }

    override fun onClick(v: View?){
        when (v?.id) {
            R.id.glimmer_video_button -> {
                val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=K4b1YGEI-Fw"))
                startActivity(i)
            }

            }
        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_glimmer, container, false)
    }

}