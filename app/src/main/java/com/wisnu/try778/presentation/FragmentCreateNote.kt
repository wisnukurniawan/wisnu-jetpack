package com.wisnu.try778.presentation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wisnu.try778.R

/**
 * Created by wisnu on 8/7/18
 */
class FragmentCreateNote : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_create_note, container, false)
    }

    companion object {

        fun newInstance(): FragmentCreateNote {
            return FragmentCreateNote()
        }

    }
}