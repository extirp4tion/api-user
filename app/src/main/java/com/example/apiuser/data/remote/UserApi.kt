package com.example.apiuser.data.remote

import com.example.apiuser.data.remote.responses.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface UserApi {
    @GET
    suspend fun getUserList(
        @Query("results") results: Int,
    ): Response
}
