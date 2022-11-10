package com.cannybits.cannyapicall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.create

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getUsers()
    }

    private fun getUsers() {

        val retro = Retro().getRetroClient().create(MajiDataApi::class.java)


        retro.getUsers().enqueue(object : Callback<List<MajiDataModel>>{
            override fun onResponse(
                call: Call<List<MajiDataModel>>,
                response: Response<List<MajiDataModel>>
            ) {
                for (q in response.body()!!){
                    Log.e("Oyooo",q.username.toString())
                }
            }

            override fun onFailure(call: Call<List<MajiDataModel>>, t: Throwable) {
                Log.e("Error","Hazijafikaa")
            }

        })
    }
}