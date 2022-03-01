package com.avazpar.dynamicThemes.ui.adapter

data class Investment(
    val title: String,
    val description: String,
    val detail: String,
    val amount: String,
    val category: InvestmentCategory
)

enum class InvestmentCategory{
    APPLE, TESLA, GOOGLE
}