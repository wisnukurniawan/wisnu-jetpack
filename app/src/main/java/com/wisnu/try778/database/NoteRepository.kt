package com.wisnu.try778.database

import android.arch.lifecycle.LiveData
import java.util.*

/**
 * Created by wisnu on 8/7/18
 */
class NoteRepository(private val noteDao: NoteDao) {

    fun saveNote(note: String) {
        val noteDb = NoteDb(id = generateUuid(), content = note)
        noteDao.insertNote(noteDb)
    }

    fun loadNotesLiveData(): LiveData<List<NoteDb>> {
        return noteDao.loadAllNotesLiveData()
    }

    private fun generateUuid(): String = UUID.randomUUID().toString()

}