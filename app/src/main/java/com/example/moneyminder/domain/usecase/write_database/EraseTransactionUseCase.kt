package com.example.moneyminder.domain.usecase.write_database

import com.example.moneyminder.domain.repository.DataStoreRepository
import com.example.moneyminder.domain.repository.TransactionRepository
import javax.inject.Inject

class EraseTransactionUseCase @Inject constructor(
    private val transactionRepository: TransactionRepository
) {
    suspend fun invoke() {
        transactionRepository.eraseTransaction()
    }
}