package com.cchrispy.notebook

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

/**
 * NoteBook
 *
 * Allow users to make notes, stacks of notes, and books of stacks.
 * Allow notes to be tied to a calendar date.
 * Allow notes to be tied to a time.
 * Allow notifications.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
