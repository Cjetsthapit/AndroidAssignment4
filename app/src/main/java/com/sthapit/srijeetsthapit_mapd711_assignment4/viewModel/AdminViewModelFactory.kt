package com.goldstein.room2.viewmodel

import AdminRepository
import AdminViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class AdminViewModelFactory(private val repository: AdminRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(AdminViewModel::class.java)) {
            return AdminViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
