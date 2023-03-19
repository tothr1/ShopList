package com.example.shoplist

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ShopListDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProduct(item: Product)
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertList(item: ShopList)
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertListItem(item: ListItem)

    @Delete
    suspend fun deleteProduct(item: Product)
    @Delete
    suspend fun deleteList(item: ShopList)
    @Delete
    suspend fun deleteItem(item: ListItem)

    @Query("SELECT * FROM 'product'")
    fun getAllProduct(): LiveData<List<Product>>
    @Query("SELECT * FROM 'shopList'")
    fun getAllList(): LiveData<List<ShopList>>
    @Query("SELECT * FROM 'listItem'")
    fun getAllItem(): LiveData<List<ListItem>>
}