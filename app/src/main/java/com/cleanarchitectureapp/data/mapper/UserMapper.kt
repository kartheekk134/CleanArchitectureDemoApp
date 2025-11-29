package com.cleanarchitectureapp.data.mapper

import com.cleanarchitectureapp.data.model.UserDto
import com.cleanarchitectureapp.domain.model.User

fun UserDto.toDomain() : User = User(
    id = id.orEmpty(),
    name = name.orEmpty()
)