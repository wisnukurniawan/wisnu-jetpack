package com.wisnu.try778

import android.arch.persistence.room.Room
import com.wisnu.try778.database.Database
import com.wisnu.try778.database.NoteRepository
import com.wisnu.try778.presentation.viewmodel.NoteViewModel
import org.koin.android.architecture.ext.viewModel
import org.koin.dsl.module.applicationContext

/**
 * Created by wisnu on 8/7/18
 */
val noteModule = applicationContext {

    // Create Database
    bean(name = Constant.Koin.DATABASE_DI) {
        Room
            .databaseBuilder(
                get(Constant.Koin.CONTEXT_APP_DI),
                Database::class.java,
                Constant.Table.DB_NAME
            )
            .fallbackToDestructiveMigration()
            .build()
    }

    // Create NoteRepository
    bean { get<Database>(Constant.Koin.DATABASE_DI).noteDao() }
    bean { NoteRepository(get()) }

    // Create NoteViewModel
    viewModel { NoteViewModel(get()) }

}