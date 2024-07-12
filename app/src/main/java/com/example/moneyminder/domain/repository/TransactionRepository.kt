package com.example.moneyminder.domain.repository

import com.example.moneyminder.data.local.entity.AccountDto
import com.example.moneyminder.data.local.entity.TransactionDto
import kotlinx.coroutines.flow.Flow


interface TransactionRepository {

    suspend fun insertTransaction(dailyExpense: TransactionDto)

    suspend fun insertAccount(accounts: List<AccountDto>)

    fun getDailyTransaction(entryDate: String): Flow<List<TransactionDto>>

    fun getTransactionByAccountType(accountType: String): Flow<List<TransactionDto>>

    fun getAccount(account: String): Flow<AccountDto>

    fun getAccounts(): Flow<List<AccountDto>>

    fun getAllTransaction(): Flow<List<TransactionDto>>

    fun eraseTransaction()

    fun getCurrentDayExpenseTransaction(): Flow<List<TransactionDto>>

    fun getWeeklyExpenseTransaction(): Flow<List<TransactionDto>>

    fun getMonthlyExpenseTransaction(): Flow<List<TransactionDto>>

    fun getThreeDayTransaction(transactionType: String): Flow<List<TransactionDto>>

    fun getSevenDayTransaction(transactionType: String): Flow<List<TransactionDto>>

    fun getFourteenDayTransaction(transactionType: String): Flow<List<TransactionDto>>

    fun getStartOfTheMonthTransaction(transactionType: String): Flow<List<TransactionDto>>

    fun getLastMonthTransaction(transactionType: String): Flow<List<TransactionDto>>

    fun getTransactionByType(transactionType: String): Flow<List<TransactionDto>>
}