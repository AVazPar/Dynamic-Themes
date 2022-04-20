package com.avazpar.dynamicThemes.ui

import android.content.Context
import com.avazpar.dynamicThemes.R

class ResourceProvider(private val context: Context) {

    val titleEvent01 = context.getString(R.string.sample_title_event_01)
    val descriptionEvent01 = context.getString(R.string.sample_description_event_01)

    val titleEvent02 = context.getString(R.string.sample_title_event_02)
    val descriptionEvent02 = context.getString(R.string.sample_description_event_02)

    val titleEvent03 = context.getString(R.string.sample_title_event_03)
    val descriptionEvent03 = context.getString(R.string.sample_description_event_03)

    val titleEvent04 = context.getString(R.string.sample_title_event_04)
    val descriptionEvent04 = context.getString(R.string.sample_description_event_04)
}