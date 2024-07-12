package com.example.moneyminder.domain.usecase.write_database

import com.example.moneyminder.data.local.entity.AccountDto
import com.example.moneyminder.domain.repository.TransactionRepository
import javax.inject.Inject

class InsertAccountUseCase @Inject constructor(
    private val transactionRepository: TransactionRepository
) {
    suspend fun invoke(accounts: List<AccountDto>) {
        transactionRepository.insertAccount(accounts)
    }
}