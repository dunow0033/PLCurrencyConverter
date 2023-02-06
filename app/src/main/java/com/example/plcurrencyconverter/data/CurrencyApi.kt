package com.example.plcurrencyconverter.data

import com.example.plcurrencyconverter.data.models.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

const val apiKey = "Uf83vb5G3322hdV2OBVwtQ1FCaPGW0lP"

interface CurrencyApi {

    //@Headers("apiKey", "Uf83vb5G3322hdV2OBVwtQ1FCaPGW0lP")
    @GET("/latest")
    suspend fun getRates(
       // @Query("symbols") symbols: String,
        @Query("base") base: String
        //@Query("apiKey") apiKey: String
    ): Response<CurrencyResponse>
}