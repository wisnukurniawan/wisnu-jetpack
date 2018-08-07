package com.wisnu.try778.presentation.recyclerview

import android.support.v7.widget.RecyclerView
import android.view.View
import com.wisnu.try778.model.Note
import kotlinx.android.synthetic.main.item_note.view.*

/**
 * Created by wisnu on 8/7/18
 */
class NoteViewHolder(itemView: View?,
                     itemLongClickListener: (Int) -> Unit) : RecyclerView.ViewHolder(itemView) {
    init {
        itemView?.setOnLongClickListener {
            itemLongClickListener(adapterPosition)
            return@setOnLongClickListener true
        }
    }

    fun bindData(note: Note) {
        itemView.item_note_content.text = note.content
    }
}