package com.example.kotlindemo.datasource

import com.example.kotlindemo.model.Bank

interface BankDataSource {
    fun retrieveBanks(): Collection<Bank>
}