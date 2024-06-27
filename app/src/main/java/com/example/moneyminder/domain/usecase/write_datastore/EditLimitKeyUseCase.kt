package com.example.moneyminder.domain.usecase.write_datastore

import com.example.moneyminder.domain.repository.DataStoreRepository
import javax.inject.Inject

class EditLimitKeyUseCase @Inject constructor(
    private val dataStoreRepository: DataStoreRepository
) {
    suspend fun invoke(enabled : Boolean){
        dataStoreRepository.writeLimitKeyToDataStore(enabled)
    }
}