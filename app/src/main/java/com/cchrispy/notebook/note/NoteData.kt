package com.cchrispy.notebook.note

import java.util.*

/**
 * Created by chrischiang on 2/26/18.
 */
open class NoteData {

    var title:  String? = null
    var text:   String? = null
    var date:   Date?   = null

    open abstract class NoteTaking {

        open fun getDateFormatted(date: Date) = "TODO" // TODO

        abstract fun writeTitle(titleText: String)
        abstract fun takeNote(noteText: String)
        abstract fun setDate(date: Date)
    }

}