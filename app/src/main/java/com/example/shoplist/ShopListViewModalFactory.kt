package com.example.shoplist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ShopListViewModalFactory(private val repository: ShopListRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ShopListViewModal::class.java)) {
            return ShopListViewModal(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}