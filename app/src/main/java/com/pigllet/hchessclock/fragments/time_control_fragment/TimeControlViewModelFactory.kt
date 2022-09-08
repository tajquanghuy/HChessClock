package com.pigllet.hchessclock.fragments.time_control_fragment

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class TimeControlViewModelFactory(
    private val application: Application,
    private val clockId: Long,
    private val editOption: Boolean
) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(TimeControlViewModel::class.java)) {
            return TimeControlViewModel(application, clockId, editOption) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}