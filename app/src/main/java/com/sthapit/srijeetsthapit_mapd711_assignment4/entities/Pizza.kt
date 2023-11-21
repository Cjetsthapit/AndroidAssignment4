package com.sthapit.srijeetsthapit_mapd711_assignment4.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pizza")
data class Pizza(
    @PrimaryKey(autoGenerate = true) val productId: Int =0,
    val pizzaName:String,
    val price: Int =0,
    val category: String
)