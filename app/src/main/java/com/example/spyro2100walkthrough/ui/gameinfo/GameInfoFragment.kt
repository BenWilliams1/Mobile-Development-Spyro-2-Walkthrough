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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.spyro_button)?.setOnClickListener(this)
    }

    override fun onClick(v: View?){
        when (v?.id)
        {
            R.id.testbutton1->{
                navController?.navigate(R.id.spyro_to_info)
            }

        }

    }


}