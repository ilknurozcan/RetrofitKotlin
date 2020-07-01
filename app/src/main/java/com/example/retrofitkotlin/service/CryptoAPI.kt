package com.example.retrofitkotlin.service

import com.example.retrofitkotlin.model.CryptoModel
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET

interface CryptoAPI {

    //GET, POST, UPDATE, DELETE


    //bbffad38331c59a824fe3d3e31202c84
    //https://api.nomics.com/v1/
    // prices?key=bbffad38331c59a824fe3d3e31202c84

    @GET("prices?key=bbffad38331c59a824fe3d3e31202c84")
    fun getData(): Observable<List<CryptoModel>>


   // fun getData(): Call<List<CryptoModel>>
}