package com.example.apprenato_10.data.remote
import com.example.apprenato_10.data.model.Post
import  retrofit2.http.GET

interface ApiService {

    @GET("/posts")
    suspend fun getPosts(): List<Post>
}