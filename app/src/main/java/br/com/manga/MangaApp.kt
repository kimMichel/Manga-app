package br.com.manga

import android.app.Application
import br.com.manga.di.signInModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MangaApp: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoinApp()
    }

    private fun startKoinApp() {
        val appModules = listOf(signInModule)
        startKoin {
            androidLogger()
            androidContext(this@MangaApp)
            modules(appModules)
        }
    }
}