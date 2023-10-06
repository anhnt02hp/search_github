package com.anhnt02.githubsearch.api

import com.anhnt02.githubsearch.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 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")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>
}