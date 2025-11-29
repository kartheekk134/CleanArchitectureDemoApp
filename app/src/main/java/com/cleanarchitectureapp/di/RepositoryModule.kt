package com.cleanarchitectureapp.di

import com.cleanarchitectureapp.data.datasource.remote.ApiService
import com.cleanarchitectureapp.data.repository.UserRepositoryImpl
import com.cleanarchitectureapp.domain.repository.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import jakarta.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideUserRepository(apiService: ApiService): UserRepository {
        return UserRepositoryImpl(apiService)
    }
}