package com.wisnu.try778.presentation.viewmodel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import com.wisnu.try778.database.NoteRepository
import com.wisnu.try778.map
import com.wisnu.try778.model.Note


/**
 * Created by wisnu on 8/7/18
 */
class NoteViewModel(private val noteRepository: NoteRepository) : ViewModel() {

    private lateinit var notesResult: LiveData<List<Note>>

    init {
        subscribeNoteResult()
    }

    fun saveNote(content: String) {
        noteRepository.saveNote(content)
    }

    fun deleteNote(note: Note) {
        noteRepository.deleteNote(note)
    }

    fun listenNotesResult(): LiveData<List<Note>> {
        return notesResult
    }

    private fun subscribeNoteResult() {
        notesResult = noteRepository.loadNotesLiveData().map { data ->
            data.reversed().map { Note(it.id, it.content) }
        }
    }

}