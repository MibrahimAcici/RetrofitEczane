package com.ibrahim.retrofiteczane.service

import com.ibrahim.retrofiteczane.model.PharmacyListItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PharmacyService {

    //URL https://openapi.izmir.bel.tr/api/ibb/nobetcieczaneler

    //BASE URL     /    "nobetcieczaneler" GET içerisine yazılacak

    @GET("nobetcieczaneler")
    fun getPharmacies(@Query("apiKeyVarsaYazılacak") apiKey:String) : Call<List<PharmacyListItem>>

}