package com.example.shoplist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ShopListViewModalFactory(private val repository: ShopListRepository) : ViewModelProvider.NewInstanceFactory() {
    override fun<T: ViewModel?> create(modelClass: Class<T>): T {
        return ShopListViewModal(repository) as T
    }

}