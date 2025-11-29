package com.cleanarchitectureapp.domain.usecase

import com.cleanarchitectureapp.domain.repository.UserRepository

class LoginUseCase(private val repository: UserRepository) {

    suspend operator fun invoke(username: String, password: String) = repository.login(username, password)
}