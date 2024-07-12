package com.example.moneyminder.domain.usecase.read_database

import com.example.moneyminder.data.local.entity.AccountDto
import com.example.moneyminder.domain.repository.TransactionRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAccountUseCase @Inject constructor(
    private val transactionRepository: TransactionRepository
) {
    operator fun invoke(account: String): Flow<AccountDto> {
        return transactionRepository.getAccount(account)
    }
}