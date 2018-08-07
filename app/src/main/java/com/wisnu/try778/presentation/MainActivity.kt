package com.wisnu.try778.presentation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.wisnu.try778.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager
        fragmentManager
            .beginTransaction()
            .replace(R.id.container_create_note, FragmentCreateNote.newInstance())
            .commit()

        fragmentManager
            .beginTransaction()
            .replace(R.id.container_list_note, FragmentListNote.newInstance())
            .commit()
    }
}
