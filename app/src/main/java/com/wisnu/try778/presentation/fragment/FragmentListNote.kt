package com.wisnu.try778.presentation.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wisnu.try778.R

/**
 * Created by wisnu on 8/7/18
 */
class FragmentListNote : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_list_note, container, false)
    }

    companion object {

        fun newInstance(): FragmentListNote {
            return FragmentListNote()
        }

    }

}