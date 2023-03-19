package com.example.shoplist

import androidx.room.*
import androidx.room.ForeignKey.SET_NULL

@Entity(
    tableName = "product",
    indices=[
        Index(value=["barcode"], unique=true)
    ]
)
data class Product (
    @PrimaryKey val barcode: String,
    val name: String,
    val price: Int
)

@Entity(
    tableName="shopList",
    indices = [
        Index(value = ["listId"], unique = true)
    ]
)
data class ShopList(
    @PrimaryKey val id: Int,
    val alias: String
)

@Entity(
    tableName="listItem",
    indices = [
        Index(value = ["itemId"], unique = true)
    ],
    foreignKeys = [
        ForeignKey(
            entity = ShopList::class,
            parentColumns = ["id"],
            childColumns = ["list_id"],
            onDelete = SET_NULL
        ),
        ForeignKey(
            entity = Product::class,
            parentColumns = ["barcode"],
            childColumns = ["barcode"],
            onDelete = SET_NULL
        )
    ]
)
data class ListItem(
    @PrimaryKey val id: Int,
    val list_id: Int,
    val barcode: String,
    val quantity: Int
)