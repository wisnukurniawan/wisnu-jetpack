package com.wisnu.try778.database

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.wisnu.try778.Constant

/**
 * Created by wisnu on 8/7/18
 */
@Dao
interface NoteDao {

    @Query("SELECT * FROM ${Constant.Table.NOTE}")
    fun loadAllNotesLiveData(): LiveData<List<NoteDb>>

    @Insert
    fun insertNote(note: NoteDb)

    @Delete
    fun deleteNote(note: NoteDb)

}