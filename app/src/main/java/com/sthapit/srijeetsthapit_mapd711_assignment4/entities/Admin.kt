package com.sthapit.srijeetsthapit_mapd711_assignment4.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "admins")
data class Admin (
    @PrimaryKey(autoGenerate = true) val employeeId:Int =0,
    @ColumnInfo(name = "userName") val userName: String,
    @ColumnInfo(name = "password") val password: String,
    @ColumnInfo(name = "firstName") val firstName: String,
    @ColumnInfo(name = "lastName") val lastName: String,
    @ColumnInfo(name = "email") val email: String
)