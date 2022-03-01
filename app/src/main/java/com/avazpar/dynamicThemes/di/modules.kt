package com.avazpar.dynamicThemes.di

import com.avazpar.dynamicThemes.ui.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val domainModule = module {
}

val dataModule = module {
}

val viewModelModule = module {
    viewModel { HomeViewModel() }
}