package com.example.moneyminder.domain.usecase.write_datastore

import com.example.moneyminder.domain.models.Currency
import java.util.Locale
import javax.inject.Inject

class GetCurrencyUseCase @Inject constructor() {

    operator fun invoke(): List<Currency>{
        val currencies = mutableListOf<Currency>()
        val countries = mutableListOf<String>()
        val allLocale = Locale.getAvailableLocales()

        allLocale.forEach { locale ->
            val countryName = locale.displayCountry
            try {
                val currencyCode = java.util.Currency.getInstance(locale).currencyCode
                val currency = java.util.Currency.getInstance(currencyCode)
                val currencySymbol = currency.getSymbol(locale)

                val currencyModel = Currency(countryName,currencyCode,currencySymbol)
                if(countryName.trim().isNotEmpty() && !countries.contains(countryName)){
                    countries.add(countryName)
                    currencies.add(currencyModel)
                }
            } catch (e: Exception){}
        }
        return currencies.sortedBy { it.country }
    }
}