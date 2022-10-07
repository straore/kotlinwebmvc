package com.example.kotlindemo.controller

import com.example.kotlindemo.model.Bank
import com.example.kotlindemo.service.BankService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class BankController(private val service: BankService) {

    @GetMapping("/banks")
    fun getBank(): Collection<Bank>{
        return service.getBanks()
    }
}