package com.example.spyro2100walkthrough.ui.walkthrough

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WalkthroughViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Walkthrough Fragment"
    }
    val text: LiveData<String> = _text
}