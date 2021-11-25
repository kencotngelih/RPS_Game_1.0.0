package com.robby.trial3chp7.ui.mainMenu

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.robby.trial3chp7.data.remote.ApiService

@Suppress("UNCHECKED_CAST")
class MainMenuFactory(private val service: ApiService) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainMenuViewModel(service) as T
    }
}