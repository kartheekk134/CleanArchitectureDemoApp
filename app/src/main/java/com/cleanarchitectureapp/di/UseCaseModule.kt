package com.cleanarchitectureapp.di

import com.cleanarchitectureapp.domain.repository.UserRepository
import com.cleanarchitectureapp.domain.usecase.LoginUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object UseCaseModule {
    @Provides
    fun provideLoginUseCase(
        repository: UserRepository
    ): LoginUseCase = LoginUseCase(repository)
}