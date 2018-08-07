package com.wisnu.try778.database

import android.arch.lifecycle.LiveData
import com.wisnu.try778.model.Note
import java.util.*

/**
 * Created by wisnu on 8/7/18
 */
class NoteRepository(private val noteDao: NoteDao) {

    fun saveNote(content: String) {
        val noteDb = NoteDb(id = generateUuid(), content = content)
        noteDao.insertNote(noteDb)
    }

    fun loadNotesLiveData(): LiveData<List<NoteDb>> {
        return noteDao.loadAllNotesLiveData()
    }

    private fun generateUuid(): String = UUID.randomUUID().toString()

    fun deleteNote(note: Note) {
        noteDao.deleteNote(note.id)
    }

}