package com.example.spyro2100walkthrough.ui.walkthrough

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

class WalkthroughFragment : Fragment(), View.OnClickListener {

    private lateinit var walkthroughViewModel: WalkthroughViewModel
    var navController: NavController?= null

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

    private fun summerForest(view: View)
    {
        view.findViewById<Button>(R.id.glimmer_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.idol_springs_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.colossus_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.hurricos_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.sunny_beach_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.ocean_speedway_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.summer_forest_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.crushs_dungeon_button)?.setOnClickListener(this)
    }

    private fun autumnPlains(view: View)
    {
        view.findViewById<Button>(R.id.skelos_badlands_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.crystal_glacier_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.breeze_harbour_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.zephyr_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.scorch_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.fracture_hills_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.magma_cone_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.shady_oasis_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.metro_speedway_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.icy_speedway_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.autumn_plains_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.gulps_overlook_button)?.setOnClickListener(this)
    }

    private fun winterTundra(view: View)
    {
        view.findViewById<Button>(R.id.mystic_marsh_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.cloud_temples_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.robotica_farms_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.metropolis_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.canyon_speedway_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.winter_tundra_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.riptos_arena_button)?.setOnClickListener(this)
        view.findViewById<Button>(R.id.dragon_shores_button)?.setOnClickListener(this)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        summerForest(view)
        autumnPlains(view)
        winterTundra(view)
    }

    override fun onClick(v: View?){
        when (v?.id)
        {
            R.id.glimmer_button->{
                navController?.navigate(R.id.walkthrough_to_glimmer)
            }
            R.id.idol_springs_button->{
                navController?.navigate(R.id.walkthrough_to_idol_springs)
            }
            R.id.colossus_button->{
                navController?.navigate(R.id.walkthrough_to_colossus)
            }
            R.id.hurricos_button->{
                navController?.navigate(R.id.walkthrough_to_hurricos)
            }
            R.id.sunny_beach_button->{
                navController?.navigate(R.id.walkthrough_to_sunnybeach)
            }
            R.id.ocean_speedway_button->{
                navController?.navigate(R.id.walkthrough_to_oceanspeedway)
            }
            R.id.summer_forest_button->{
                navController?.navigate(R.id.walkthrough_to_summerforest)
            }
            R.id.crushs_dungeon_button->{
                navController?.navigate(R.id.walkthrough_to_crush)
            }
            R.id.skelos_badlands_button->{
                navController?.navigate(R.id.walkthrough_to_skelosbadlands)
            }
            R.id.crystal_glacier_button->{
                navController?.navigate(R.id.walkthrough_to_crystalglacier)
            }
            R.id.breeze_harbour_button->{
                navController?.navigate(R.id.walkthrough_to_breezeharbour)
            }
            R.id.zephyr_button->{
                navController?.navigate(R.id.walkthrough_to_zephyr)
            }
            R.id.scorch_button->{
                navController?.navigate(R.id.walkthrough_to_scorch)
            }
            R.id.fracture_hills_button->{
                navController?.navigate(R.id.walkthrough_to_fracturehills)
            }
            R.id.magma_cone_button->{
                navController?.navigate(R.id.walkthrough_to_magmacone)
            }
            R.id.shady_oasis_button->{
                navController?.navigate(R.id.walkthrough_to_shadyoasis)
            }
            R.id.metro_speedway_button->{
                navController?.navigate(R.id.walkthrough_to_metrospeedway)
            }
            R.id.icy_speedway_button->{
                navController?.navigate(R.id.walkthrough_to_icyspeedway)
            }
            R.id.autumn_plains_button->{
                navController?.navigate(R.id.walkthrough_to_autumnplains)
            }
            R.id.gulps_overlook_button->{
                navController?.navigate(R.id.walkthrough_to_gulpsoverlook)
            }
            R.id.mystic_marsh_button->{
                navController?.navigate(R.id.walkthrough_to_mysticmarsh)
            }
            R.id.cloud_temples_button->{
                navController?.navigate(R.id.walkthrough_to_cloudtemples)
            }
            R.id.robotica_farms_button->{
                navController?.navigate(R.id.walkthrough_to_roboticafarms)
            }
            R.id.metropolis_button->{
                navController?.navigate(R.id.walkthrough_to_metropolis)
            }
            R.id.canyon_speedway_button->{
                navController?.navigate(R.id.walkthrough_to_canyonspeedway)
            }
            R.id.winter_tundra_button->{
                navController?.navigate(R.id.walkthrough_to_wintertundra)
            }
            R.id.riptos_arena_button->{
                navController?.navigate(R.id.walkthrough_to_riptosarena)
            }
            R.id.dragon_shores_button->{
                navController?.navigate(R.id.walkthrough_to_dragonshores)
            }
        }
    }

}