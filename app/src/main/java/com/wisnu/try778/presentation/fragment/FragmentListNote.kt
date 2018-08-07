package com.wisnu.try778.presentation.fragment

import android.arch.lifecycle.Observer
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wisnu.try778.R
import com.wisnu.try778.model.Note
import com.wisnu.try778.presentation.recyclerview.NoteAdapter
import com.wisnu.try778.presentation.viewmodel.NoteViewModel
import kotlinx.android.synthetic.main.fragment_list_note.*
import org.koin.android.architecture.ext.viewModel

/**
 * Created by wisnu on 8/7/18
 */
class FragmentListNote : Fragment() {

    private val noteViewModel by viewModel<NoteViewModel>()

    private val adapter: NoteAdapter by lazy {
        NoteAdapter { position -> doOnLongItemClickListener(position) }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_list_note, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        list_note.layoutManager = LinearLayoutManager(activity)
        list_note.adapter = adapter

        noteViewModel.listenNotesResult().observe(this, Observer {
            if (it?.isNotEmpty() == true) {
                val noteResultTem = mutableListOf<Note>()
                noteResultTem.addAll(it.toMutableList())
                adapter.updateData(noteResultTem)
            }
        })
    }

    private fun doOnLongItemClickListener(position: Int) {

    }

    companion object {

        fun newInstance(): FragmentListNote {
            return FragmentListNote()
        }

    }

}