package com.wisnu.try778.database

import android.arch.persistence.room.PrimaryKey
import com.wisnu.try778.Constant

/**
 * Created by wisnu on 8/7/18
 */
@android.arch.persistence.room.Entity(
    tableName = Constant.Table.NOTE_DB
)
class NoteDb(@PrimaryKey val id: String,
             val content: String)