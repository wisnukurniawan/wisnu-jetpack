package com.wisnu.try778.presentation.recyclerview

import android.support.v7.util.DiffUtil
import com.wisnu.try778.model.Note

/**
 * Created by wisnu on 8/7/18
 */
class NoteDiffUtilCallback(private val oldData: MutableList<Note>,
                           private val newData: MutableList<Note>) : DiffUtil.Callback() {

    override fun areItemsTheSame(oldItemPosition: Int,
                                 newItemPosition: Int): Boolean {
        return oldData[oldItemPosition].id == newData[newItemPosition].id
    }

    override fun getOldListSize(): Int = oldData.size

    override fun getNewListSize(): Int = newData.size

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldData[oldItemPosition] == newData[newItemPosition]
    }
}