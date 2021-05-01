package com.example.spyro2100walkthrough.ui.gameinfo

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
import com.example.spyro2100walkthrough.R

class GameInfoFragment : Fragment(), View.OnClickListener {

    private lateinit var gameInfoViewModel: GameInfoViewModel
    var navController: NavController?= null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
            View? {
        gameInfoViewModel =
            ViewModelProvider(this).get(GameInfoViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_gameinfo, container, false)
        val textView: TextView = root.findViewById(R.id.text_gameinfo)
        gameInfoViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    fun characterButtons(view: View)
    {
        view.findViewById<Button>(R.id.spyro_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.spark_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.hunter_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.professor_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.elora_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.zoe_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.moneybags_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.crush_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.gulp_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.ripto_button)?.setOnClickListener(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        characterButtons(view)
    }

    override fun onClick(v: View?){
        when (v?.id)
        {
            R.id.spyro_button->{
                navController?.navigate(R.id.spyro_to_info)
            }

            R.id.spark_button->{
                navController?.navigate(R.id.sparks_to_info)
            }

            R.id.hunter_button->{
                navController?.navigate(R.id.hunter_to_info)
            }

            R.id.professor_button->{
                navController?.navigate(R.id.professor_to_info)
            }

            R.id.elora_button->{
                navController?.navigate(R.id.elora_to_info)
            }

            R.id.zoe_button->{
                navController?.navigate(R.id.zoe_to_info)
            }

            R.id.moneybags_button->{
                navController?.navigate(R.id.moneybags_to_info)
            }

            R.id.crush_button->{
                navController?.navigate(R.id.crush_to_info)
            }

            R.id.gulp_button->{
                navController?.navigate(R.id.gulp_to_info)
            }

            R.id.ripto_button->{
                navController?.navigate(R.id.ripto_to_info)
            }
        }
    }
}