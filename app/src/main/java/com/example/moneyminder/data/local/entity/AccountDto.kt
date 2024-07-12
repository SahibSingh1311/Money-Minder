package com.example.moneyminder.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "accounts_table")
data class AccountDto(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    val id: String,

    @ColumnInfo(name = "account")
    val accountType: String,

    @ColumnInfo(name = "amount")
    val amount: Double,

    @ColumnInfo(name = "income")
    val income: Double,

    @ColumnInfo(name = "expense")
    val expense: Double
)
