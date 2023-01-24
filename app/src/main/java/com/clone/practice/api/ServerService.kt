package com.clone.practice.api

import retrofit2.http.POST
import retrofit2.http.Query

interface ServerService {

    @POST("book/readbook/")
    fun postBook(){
        //@Query("user_id") userId : Int
    }
}