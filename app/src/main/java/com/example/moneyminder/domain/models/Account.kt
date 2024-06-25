package com.example.moneyminder.domain.models

data class Account(
    val accountNumber : String,
    val amount : Double,
    val income : Double,
    val expense : Double
)
