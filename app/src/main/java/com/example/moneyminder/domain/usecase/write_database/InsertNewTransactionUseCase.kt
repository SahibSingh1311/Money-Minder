package com.example.moneyminder.domain.usecase.write_database

import com.example.moneyminder.data.local.entity.TransactionDto
import com.example.moneyminder.domain.repository.TransactionRepository
import javax.inject.Inject

class InsertNewTransactionUseCase @Inject constructor(
    private val transactionRepository: TransactionRepository
) {
    suspend fun invoke(dailyExpense: TransactionDto) {
        transactionRepository.insertTransaction(dailyExpense)
    }
}