package com.example.apprenato_10.repository

import com.example.apprenato_10.data.remote.RetrofitInstance
import com.example.apprenato_10.data.model.Post

class PostRepository{

    suspend fun getPosts(): List<Post>{
        return RetrofitInstance.api.getPosts()
    }
}