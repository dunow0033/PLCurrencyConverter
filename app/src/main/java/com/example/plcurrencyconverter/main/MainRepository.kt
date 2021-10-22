package com.example.plcurrencyconverter.main

import com.example.plcurrencyconverter.data.models.CurrencyResponse
import com.example.plcurrencyconverter.util.Resource

interface MainRepository {
    suspend fun getRates(base: String): Resource<CurrencyResponse>
}