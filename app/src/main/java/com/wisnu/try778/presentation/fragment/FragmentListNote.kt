package com.wisnu.try778.presentation.fragment

import android.arch.lifecycle.Observer
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wisnu.try778.R
import com.wisnu.try778.presentation.viewmodel.NoteViewModel
import org.koin.android.architecture.ext.viewModel

/**
 * Created by wisnu on 8/7/18
 */
class FragmentListNote : Fragment() {

    private val noteViewModel by viewModel<NoteViewModel>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_list_note, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        noteViewModel.listenNotesResult().observe(this, Observer {
            Log.d("wisnu_tes", "$it")
        })
    }

    companion object {

        fun newInstance(): FragmentListNote {
            return FragmentListNote()
        }

    }

}