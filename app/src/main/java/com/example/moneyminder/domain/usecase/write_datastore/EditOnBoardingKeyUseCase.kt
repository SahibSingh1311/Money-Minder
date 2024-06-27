package com.example.moneyminder.domain.usecase.write_datastore

import com.example.moneyminder.domain.repository.DataStoreRepository
import javax.inject.Inject

class EditOnBoardingKeyUseCase @Inject constructor(
    private val dataStoreRepository: DataStoreRepository
) {
    suspend fun invoke(completed : Boolean){
        dataStoreRepository.writeOnBoardingKeyToDataStore(completed)
    }
}