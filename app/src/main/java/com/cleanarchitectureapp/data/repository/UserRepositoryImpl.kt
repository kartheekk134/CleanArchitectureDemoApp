package com.cleanarchitectureapp.data.repository

import com.cleanarchitectureapp.data.datasource.remote.ApiService
import com.cleanarchitectureapp.data.mapper.toDomain
import com.cleanarchitectureapp.domain.model.User
import com.cleanarchitectureapp.domain.repository.UserRepository

class UserRepositoryImpl(private val api: ApiService) : UserRepository {
    override suspend fun login(
        userName: String,
        passWord: String
    ): User {
        return api.login(userName, passWord).toDomain()
    }

}