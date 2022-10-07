package com.example.kotlindemo.datasource.mock

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest {

    private val mockDataSource = MockBankDataSource()
    @Test
    fun `should provide a collection of banks` () {

        val banks = mockDataSource.retrieveBanks()
        Assertions.assertThat(banks).isNotEmpty
    }

    @Test
    fun `should provide some mock data` () {
    // given
    val banks = mockDataSource.retrieveBanks()

        assertThat(banks).allMatch{ it.accountNumber.isNotBlank()}
        assertThat(banks).anyMatch{ it.trust != 0.0 }
        assertThat(banks).allMatch{ it.transactionFee != 0 }

    // when


    // then

    }

}