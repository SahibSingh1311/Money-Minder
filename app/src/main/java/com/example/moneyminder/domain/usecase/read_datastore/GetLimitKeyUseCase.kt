package com.example.moneyminder.domain.usecase.read_datastore

import com.example.moneyminder.domain.repository.DataStoreRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetLimitKeyUseCase @Inject constructor(
    private val dataStoreRepository: DataStoreRepository
) {
    suspend operator fun invoke(): Flow<Boolean> {
        return dataStoreRepository.readLimitKeyFromDataStore()
    }
}