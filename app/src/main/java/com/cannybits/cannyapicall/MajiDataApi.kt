package com.cannybits.cannyapicall

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface MajiDataApi {
    @GET("users")
    fun getUsers(): Call<List<MajiDataModel>>


    @FormUrlEncoded
    @POST("users/login")
    fun userLogin(
        @Field("username") username:String,
        @Field("password") password: String
    ):Call<List<MajiDataModel>>

}