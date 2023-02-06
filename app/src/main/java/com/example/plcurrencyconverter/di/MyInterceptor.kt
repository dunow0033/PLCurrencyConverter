package com.example.plcurrencyconverter.di

import okhttp3.Interceptor
import okhttp3.Response

class MyInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
            .newBuilder()
            .addHeader("apiKey", "Uf83vb5G3322hdV2OBVwtQ1FCaPGW0lP")
            .build()
        return chain.proceed(request)
    }
}