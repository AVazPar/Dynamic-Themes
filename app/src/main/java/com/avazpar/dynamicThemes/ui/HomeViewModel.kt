package com.avazpar.dynamicThemes.ui

import androidx.lifecycle.ViewModel
import com.avazpar.dynamicThemes.ui.adapter.Event
import com.avazpar.dynamicThemes.ui.adapter.EventCategory

class HomeViewModel : ViewModel() {

    private val item01 = Event(
        title = "Hogwarts Dinner",
        description = "Today - Hogwarts dining hall",
        category = EventCategory.HOGWARTS
    )

    private val item02 = Event(
        title = "Slytherin weekly",
        description = "Slytherin Common rooms",
        category = EventCategory.HOUSE
    )

    private val item03 = Event(
        title = "Send Dobby to do my tasks",
        description = "Until Friday",
        category = EventCategory.PERSONAL
    )

    private val item04 = Event(
        title = "Training Quidditch",
        description = "Quidditch Stadium",
        category = EventCategory.HOUSE
    )

    fun getInvestmentList(): List<Event> =
        listOf(item02, item03, item01, item04)
}