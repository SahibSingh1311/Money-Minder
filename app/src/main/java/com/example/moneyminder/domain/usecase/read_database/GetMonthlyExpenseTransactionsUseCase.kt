package com.example.moneyminder.domain.usecase.read_database

import com.example.moneyminder.data.local.entity.TransactionDto
import com.example.moneyminder.domain.repository.TransactionRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetMonthlyExpenseTransactionsUseCase @Inject constructor(
    private val transactionRepository: TransactionRepository
) {
    operator fun invoke(): Flow<List<TransactionDto>> {
        return transactionRepository.getMonthlyExpenseTransaction()
    }
}