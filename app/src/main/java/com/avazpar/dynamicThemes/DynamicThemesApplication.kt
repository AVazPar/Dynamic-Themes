package com.avazpar.dynamicThemes

import android.app.Application
import com.avazpar.dynamicThemes.di.dataModule
import com.avazpar.dynamicThemes.di.domainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import com.avazpar.dynamicThemes.di.viewModelModule as viewModelModule1

class DynamicThemesApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@DynamicThemesApplication)
            modules(modules = listOf(
                viewModelModule1,
                domainModule,
                dataModule
            ))
        }

    }
}