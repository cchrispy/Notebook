package com.cchrispy.notebook.stack

import com.cchrispy.notebook.note.Category
import com.cchrispy.notebook.note.Note
import java.util.*

/**
 * Created by chrischiang on 2/27/18.
 */
open class Stack {

    enum class Order {
        CHRONOLOGICAL, STARRED, CATEGORY, CUSTOM
    }

    var title: String? = null
    var starred: Boolean = false
    var dateCreated: Date? = null
    val notes: MutableList<Note> = mutableListOf()

    open fun getDateFormatted(date: Date) = "TODO" // TODO

    open fun addNote(note: Note) = notes.add(note)

    open fun removeNote(note: Note) = notes.remove(note)

    open fun containsNote(note: Note) = notes.contains(note)

    fun getStarredNotes(): List<Note> {
        val starredNotes = mutableListOf<Note>()
        notes.forEach({ if (it.starred) starredNotes.add(it) })
        return starredNotes
    }

    fun getCategoryNotes(category: Category): List<Note> {
        val categoryNotes = mutableListOf<Note>()
        notes.forEach({ if (it.category == category) categoryNotes.add(it) })
        return categoryNotes
    }

    fun getCategories(): Set<Category> {
        val categories = mutableSetOf<Category>()
        notes.forEach({
//            it.category?.apply {  } // TODO: add to categories
        })
        return categories
    }

    fun getStarredNotesCount(): Int = getStarredNotes().size

    fun getCategoryNoteCount(category: Category): Int = getCategoryNotes(category).size

    fun moveNoteToFront(note: Note) {
        val index = notes.indexOf(note)
        notes.removeAt(index)
        notes.add(index, note)
    }

    fun moveNoteToBack(note: Note) {
        val index = notes.indexOf(note)
        notes.removeAt(index)
        notes.add(note)
    }
}