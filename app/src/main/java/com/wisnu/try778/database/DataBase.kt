package com.wisnu.try778.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

/**
 * Created by wisnu on 8/7/18
 */
@Database(
    version = 1,
    entities = [
        NoteDb::class
    ]
)
abstract class Database : RoomDatabase() {
    abstract fun noteDao(): NoteDao
}