package com.avazpar.dynamicThemes.ui

import androidx.lifecycle.ViewModel
import com.avazpar.dynamicThemes.ui.adapter.Investment
import com.avazpar.dynamicThemes.ui.adapter.InvestmentCategory

class HomeViewModel : ViewModel() {

    private val item01 = Investment(
        title = "",
        description = "",
        detail = "",
        amount = "",
        category = InvestmentCategory.APPLE
    )

    private val item02 = Investment(
        title = "",
        description = "",
        detail = "",
        amount = "",
        category = InvestmentCategory.APPLE
    )

    private val item03 = Investment(
        title = "",
        description = "",
        detail = "",
        amount = "",
        category = InvestmentCategory.APPLE
    )

    fun getInvestmentList(): List<Investment> =
        listOf(item01, item02, item03)
}