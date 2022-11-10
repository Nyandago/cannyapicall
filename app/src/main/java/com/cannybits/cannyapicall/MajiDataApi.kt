package com.cannybits.cannyapicall

import retrofit2.Call
import retrofit2.http.GET

interface MajiDataApi {
    @GET("users")
    fun getUsers(): Call<List<MajiDataModel>>

}