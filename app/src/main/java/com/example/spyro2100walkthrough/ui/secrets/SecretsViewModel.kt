package com.example.spyro2100walkthrough.ui.secrets

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class SecretsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Secrets"
    }
    val text: LiveData<String> = _text
}