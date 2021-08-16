package com.example.shoppinglist.data.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shopping Items")
data class ShoppingItem(
        @ColumnInfo(name = "item_Name")
        var name: String,

        @ColumnInfo(name = "item_amount")
        var amount: Int
) {
        @PrimaryKey(autoGenerate = true)
        var id: Int?=null

}