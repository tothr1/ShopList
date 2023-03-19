package com.example.shoplist

class ShopListRepository(private val db:ShopListDatabase) {
    suspend fun insertProduct(items: Product) = db.getShopListDao().insertProduct(items)
    suspend fun insertList(items: ShopList) = db.getShopListDao().insertList(items)
    suspend fun insertListItem(items: ListItem) = db.getShopListDao().insertListItem(items)

    suspend fun deleteProduct(items: Product) = db.getShopListDao().deleteProduct(items)
    suspend fun deleteList(items: ShopList) = db.getShopListDao().deleteList(items)
    suspend fun deleteListItem(items: ListItem) = db.getShopListDao().deleteItem(items)

    fun getAllProduct() = db.getShopListDao().getAllProduct()
    fun getAllList() = db.getShopListDao().getAllList()
    fun getAllItem() = db.getShopListDao().getAllItem()
}