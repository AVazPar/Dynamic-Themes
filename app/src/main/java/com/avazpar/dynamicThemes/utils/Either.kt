package com.avazpar.dynamicThemes.utils

sealed class Either<out L, out R> {

    data class Left<out T>(val value: T) : Either<T, Nothing>() {
        override fun isRight(): Boolean = false
        override fun isLeft(): Boolean = true
    }

    data class Right<out T>(val value: T) : Either<Nothing, T>() {
        override fun isRight(): Boolean = true
        override fun isLeft(): Boolean = false
    }

    inline fun <C> fold(left: (L) -> C, right: (R) -> C): C = when (this) {
        is Left -> left(value)
        is Right -> right(value)
    }

    inline fun <C> map(f: (R) -> C): Either<L, C> = fold(
        { Left(it) },
        { Right(f(it)) }
    )

    inline fun <C> mapLeft(f: (L) -> C): Either<C, R> = fold(
        { Left(f(it)) },
        { Right(it) }
    )

    abstract fun isLeft(): Boolean
    abstract fun isRight(): Boolean
}