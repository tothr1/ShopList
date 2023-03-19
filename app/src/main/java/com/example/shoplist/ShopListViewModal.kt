package com.example.shoplist

import android.provider.Settings
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ShopListViewModal(private val repository: ShopListRepository) : ViewModel() {
    fun insertProduct(items: Product) = GlobalScope.launch {
        repository.insertProduct(items)
    }

    fun insertList(items: ShopList) = GlobalScope.launch {
        repository.insertList(items)
    }

    fun insertItem(items: ListItem) = GlobalScope.launch {
        repository.insertListItem(items)
    }

    fun deleteProduct(items:Product) = GlobalScope.launch {
        repository.deleteProduct(items)
    }

    fun deleteList(items: ShopList) = GlobalScope.launch {
        repository.deleteList(items)
    }

    fun deleteItems(items: ListItem) = GlobalScope.launch {
        repository.deleteListItem(items)
    }

    fun getAllProduct() = repository.getAllProduct()
    fun getAllList() = repository.getAllList()
    fun getAllItem() = repository.getAllItem()
}