package com.example.moneyminder.domain.usecase.write_datastore

import com.example.moneyminder.domain.repository.DataStoreRepository
import javax.inject.Inject

class EditCurrencyUseCase @Inject constructor(
    private val dataStoreRepository: DataStoreRepository
) {
    suspend fun invoke(currency: String) {
        dataStoreRepository.writeCurrencyToDataStore(currency)
    }
}