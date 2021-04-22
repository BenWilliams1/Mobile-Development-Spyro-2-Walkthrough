package com.example.spyro2100walkthrough.ui.walkthrough

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WalkthroughViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "100% Walkthrough"
    }
    val text: LiveData<String> = _text
}