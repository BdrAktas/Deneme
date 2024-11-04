package com.aktasbdr.cryptocase.feature_crypto.data.service

import com.aktasbdr.cryptocase.feature_crypto.data.model.CoinsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface CommonService {

    @GET("v2/ticker")
    suspend fun getTickers(
        @Query("pairSymbol") pairSymbol: String
    ): CoinsResponse
}