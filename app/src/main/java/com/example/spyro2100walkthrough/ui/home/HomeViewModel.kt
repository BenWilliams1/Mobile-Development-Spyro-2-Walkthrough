package com.example.spyro2100walkthrough.ui.home

import android.widget.Button
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.spyro2100walkthrough.R

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Home"
    }
    val text: LiveData<String> = _text


}