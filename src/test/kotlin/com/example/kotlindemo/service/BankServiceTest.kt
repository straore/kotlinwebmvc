package com.example.kotlindemo.service

import com.example.kotlindemo.datasource.BankDataSource
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BankServiceTest{
    private val dataSource: BankDataSource = mockk(relaxed = true)
    private val bankService = BankService(dataSource)
    @Test
    fun `should call its data source to retrieve banks` () {
    // given
        // relaxed = true permet de ne pas definir le comportement du mock, on aura des valeurs par defaut
//every { dataSource.retrieveBanks() } returns emptyList()

   val banks = bankService.getBanks()
    // then
verify( exactly = 1 ){dataSource.retrieveBanks()}
    }
}