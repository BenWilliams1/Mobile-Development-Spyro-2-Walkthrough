package com.example.spyro2100walkthrough.ui.gameinfo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GameInfoViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Game Info"
    }
    val text: LiveData<String> = _text


}