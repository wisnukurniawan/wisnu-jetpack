package com.wisnu.try778.presentation.recyclerview

import android.support.v7.util.DiffUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.wisnu.try778.R
import com.wisnu.try778.model.Note

/**
 * Created by wisnu on 8/7/18
 */
class NoteAdapter(private val itemLongClickListener: (Int) -> Unit) : RecyclerView.Adapter<NoteViewHolder>() {

    private var data: MutableList<Note> = mutableListOf()

    fun getDataAtPosition(position: Int): Note = data[position]

    fun setData(data: MutableList<Note>) {
        val diffResult = DiffUtil.calculateDiff(
            NoteDiffUtilCallback(this.data, data)
        )

        this.data = data
        diffResult.dispatchUpdatesTo(this)
    }

    fun updateData(data: MutableList<Note>) {
        val diffResult = DiffUtil.calculateDiff(
            NoteDiffUtilCallback(this.data, data)
        )

        this.data.clear()
        this.data.addAll(data)
        diffResult.dispatchUpdatesTo(this)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val itemView = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_note, parent, false)

        return NoteViewHolder(itemView, itemLongClickListener)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        if (position != RecyclerView.NO_POSITION) {
            holder.bindData(data[position])
        }
    }

}