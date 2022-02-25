package com.avazpar.dynamicThemes.utils

data class UseCaseError(val message: String)
data class RepositoryError(val message: String)
data class NetworkError(val message: String)

fun NetworkError.toRepositoryError() = RepositoryError(
    message = this.message
)

fun RepositoryError.toUseCaseError() = UseCaseError(
    message = this.message
)