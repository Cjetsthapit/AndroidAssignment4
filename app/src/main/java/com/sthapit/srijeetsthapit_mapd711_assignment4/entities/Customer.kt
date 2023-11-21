package com.sthapit.srijeetsthapit_mapd711_assignment4.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "customers")
data class Customer(
    @PrimaryKey( autoGenerate = true)  val customerId: Int =0,
    val userName:String,
    val password:String,
    val firstname:String,
    val lastname:String,
    val address:String,
    val city:String,
    val postalCode:String
)