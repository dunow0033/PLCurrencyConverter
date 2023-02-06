package com.example.plcurrencyconverter.main

import android.util.Log
import com.example.plcurrencyconverter.data.CurrencyApi
import com.example.plcurrencyconverter.data.models.CurrencyResponse
import com.example.plcurrencyconverter.util.Resource
import java.lang.Exception
import javax.inject.Inject

class DefaultMainRepository @Inject constructor(
    private val api: CurrencyApi
) : MainRepository {

    override suspend fun getRates(base: String): Resource<CurrencyResponse>{
        return try {
            val response = api.getRates(base)
            val result = response.body()
            if(response.isSuccessful && result != null) {
                Resource.Success(result)
                Log.d("Main", response.headers().toString())
            } else {
                Resource.Error(response.message())
            }
        } catch(e: Exception) {
            Resource.Error(e.message ?: "An error occurred")
        }
    }
}