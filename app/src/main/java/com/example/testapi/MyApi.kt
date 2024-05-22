package com.example.testapi

import retrofit2.Call
import retrofit2.http.GET

interface MyApi {

    @GET("cbr/api_get_data.php?limit=1")
    fun getComments(): Call<List<Comments>>
}
