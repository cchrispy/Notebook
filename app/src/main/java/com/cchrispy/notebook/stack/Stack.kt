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
    var order: Order = Order.CHRONOLOGICAL
    val notes: MutableList<Note> = mutableListOf()

    open fun getDateFormatted(date: Date) = "TODO" // TODO

    open fun addNote(note: Note) = notes.add(note)

    open fun removeNote(note: Note) = notes.remove(note)

    open fun containsNote(note: Note) = notes.contains(note)

    fun getStarredNotes() = notes.filter { it.starred }

    fun getCategoryNotes(category: Category) = notes.filter { it.category == category}

    fun getCategories(): Set<Category> {
        val categories = mutableSetOf<Category>()
        notes.forEach { it.category?.let { categories.add(it) } }
        return categories
    }

    fun getStarredNotesCount() = getStarredNotes().size

    fun getCategoryNoteCount(category: Category) = getCategoryNotes(category).size

    fun getCategoryCount() = getCategories().size

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