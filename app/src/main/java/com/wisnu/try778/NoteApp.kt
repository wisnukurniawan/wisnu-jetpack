package com.wisnu.try778

import android.app.Application
import org.koin.android.ext.android.startKoin
import org.koin.dsl.module.applicationContext

/**
 * Created by wisnu on 8/7/18
 */
class NoteApp : Application() {

    private val applicationModule = applicationContext {
        bean(Constant.Koin.CONTEXT_APP_DI) { this@NoteApp.applicationContext }
    }

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        startKoin(
            this,
            listOf(
                applicationModule,
                noteModule
            )
        )
    }
}