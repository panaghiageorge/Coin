package com.example.user.coin;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
interface APIInterface {

    @Headers("X-CMC_PRO_API_KEY: 41d0609d-e207-43b9-885b-ce310031093d")
    @GET("/v1/cryptocurrency/listings/latest?")
    Call<CryptoList> doGetUserList(@Query("limit") String page);
}