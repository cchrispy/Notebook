package com.cchrispy.notebook.stack

import com.cchrispy.notebook.note.Note
import java.util.*

/**
 * Created by chrischiang on 2/27/18.
 */
open class Stack {
    var title: String? = null
    var dateCreated: Date? = null
    var notes: MutableList<Note> = mutableListOf()

    open fun getDateFormatted(date: Date) = "TODO" // TODO

    open fun addNote(note: Note) = notes.add(note)

    open fun removeNote(note: Note) = notes.remove(note)

    open fun containsNote(note: Note) = notes.contains(note)
}