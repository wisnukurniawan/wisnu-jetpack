package com.wisnu.try778.database

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.wisnu.try778.Constant

/**
 * Created by wisnu on 8/7/18
 */
@Entity(
    tableName = Constant.Table.NOTE
)
class NoteDb(@PrimaryKey val id: String,
             val content: String)