package com.avazpar.dynamicThemes.ui.adapter

data class Event(
    val title: String,
    val description: String,
    val category: EventCategory
)

enum class EventCategory{
    HOUSE, HOGWARTS, PERSONAL
}