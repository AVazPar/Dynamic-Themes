package com.avazpar.dynamicThemes.ui

import androidx.lifecycle.ViewModel
import com.avazpar.dynamicThemes.ui.adapter.Event
import com.avazpar.dynamicThemes.ui.adapter.EventCategory

class HomeViewModel(
    private val resourceProvider: ResourceProvider
) : ViewModel() {

    private val item01 = Event(
        title = resourceProvider.titleEvent01,
        description = resourceProvider.descriptionEvent01,
        category = EventCategory.HOGWARTS
    )

    private val item02 = Event(
        title = resourceProvider.titleEvent02,
        description = resourceProvider.descriptionEvent02,
        category = EventCategory.HOUSE
    )

    private val item03 = Event(
        title = resourceProvider.titleEvent03,
        description = resourceProvider.descriptionEvent03,
        category = EventCategory.PERSONAL
    )

    private val item04 = Event(
        title = resourceProvider.titleEvent04,
        description = resourceProvider.descriptionEvent04,
        category = EventCategory.HOUSE
    )

    fun getInvestmentList(): List<Event> =
        listOf(item02, item03, item01, item04)
}