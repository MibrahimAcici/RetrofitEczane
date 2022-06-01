package com.ibrahim.retrofiteczane.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
//URL https://openapi.izmir.bel.tr/api/ibb/nobetcieczaneler
class PharmacyApi {
    private val BASE_URL = "https://openapi.izmir.bel.tr/api/ibb/"

    private val pharmacyApi: PharmacyService = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(PharmacyService::class.java)

    fun getPharmacyService() = pharmacyApi
}