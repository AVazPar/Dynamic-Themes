package com.avazpar.dynamicThemes.di

import com.avazpar.dynamicThemes.ui.HomeViewModel
import com.avazpar.dynamicThemes.ui.ResourceProvider
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
}

val providerModule = module {
    factory { ResourceProvider(androidContext()) }
}