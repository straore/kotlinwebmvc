package com.example.kotlindemo.service

import com.example.kotlindemo.datasource.BankDataSource
import com.example.kotlindemo.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> {
        return dataSource.retrieveBanks()
    }
}