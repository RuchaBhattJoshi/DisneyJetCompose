package com.example.disneyjetcompose.network

import com.example.disneyjetcompose.model.Poster
import com.skydoves.sandwich.ApiResponse
import retrofit2.http.GET


//create interface for retrofit call handle response using skydoves's sandwich lib for network response
interface DisneyApi {

    @GET("DisneyPosters.json")
    suspend fun fetchDisneyPosterList(): ApiResponse<List<Poster>>

}