package com.gruposalinas.movies4u.services

import com.gruposalinas.movies4u.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("popular?api_key=86cecfbf29c87e7457796d4d2963ec9c")
    fun getMovieList(): Call<MovieResponse>
}