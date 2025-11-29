package com.cleanarchitectureapp.data.datasource.remote

import com.cleanarchitectureapp.data.model.UserDto
import retrofit2.http.Query

interface ApiService {
    suspend fun login(@Query("username") username: String,
                      @Query("password") password: String): UserDto
}