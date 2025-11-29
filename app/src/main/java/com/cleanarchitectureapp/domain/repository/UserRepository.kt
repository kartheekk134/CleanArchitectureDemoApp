package com.cleanarchitectureapp.domain.repository

import com.cleanarchitectureapp.domain.model.User

interface UserRepository {
    suspend fun login(userName: String, passWord: String): User
}