package com.example.moneyminder.domain.models

data class Currency(
    val country : String = String(),
    val currencyCode : String = String(),
    val currencySymbol : String = String()
)
