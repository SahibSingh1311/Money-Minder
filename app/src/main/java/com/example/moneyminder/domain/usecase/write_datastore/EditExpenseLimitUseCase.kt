package com.example.moneyminder.domain.usecase.write_datastore

import com.example.moneyminder.domain.repository.DataStoreRepository
import javax.inject.Inject

class EditExpenseLimitUseCase @Inject constructor(
    private val dataStoreRepository: DataStoreRepository
) {
    suspend fun invoke(amount: Double) {
        dataStoreRepository.writeExpenseLimitToDataStore(amount)
    }
}