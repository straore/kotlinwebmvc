package com.example.kotlindemo.datasource.mock

import com.example.kotlindemo.datasource.BankDataSource
import com.example.kotlindemo.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {

    val listOf = listOf(
        Bank("1234", 0.0, 17),
        Bank("1010", 17.0, 1),
        Bank("5678", 0.0, 100))

    override fun retrieveBanks(): Collection<Bank> {
        return listOf
    }
}