package com.sthapit.srijeetsthapit_mapd711_assignment4.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "order")
data class Order (
    @PrimaryKey(autoGenerate = true) val orderId: Int=0,
    val productId: Int,
    val employeeId:Int,
    val orderDate:String,
    val quantity:Int,
    val status: Int
)