package com.avazpar.dynamicThemes.ui

import androidx.lifecycle.ViewModel
import com.avazpar.dynamicThemes.ui.adapter.Investment
import com.avazpar.dynamicThemes.ui.adapter.InvestmentCategory

class HomeViewModel : ViewModel() {

    private val item01 = Investment(
        title = "Apple",
        description = "AAPL",
        detail = "$63,50(90,04%)",
        amount = "$134,36",
        category = InvestmentCategory.APPLE
    )

    private val item02 = Investment(
        title = "Tesla Motors",
        description = "TSLA",
        detail = "$63,50(90,04%)",
        amount = "$134,36",
        category = InvestmentCategory.GOOGLE
    )

    private val item03 = Investment(
        title = "NIKE",
        description = "NIKE",
        detail = "$63,50(90,04%)",
        amount = "$134,36",
        category = InvestmentCategory.TESLA
    )

    fun getInvestmentList(): List<Investment> =
        listOf(item01, item02, item03)
}