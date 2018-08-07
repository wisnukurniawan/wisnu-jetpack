package com.wisnu.try778

import com.wisnu.try778.presentation.viewmodel.NoteViewModel
import org.koin.android.architecture.ext.viewModel
import org.koin.dsl.module.applicationContext

/**
 * Created by wisnu on 8/7/18
 */
val noteModule = applicationContext {
    viewModel { NoteViewModel() }
}