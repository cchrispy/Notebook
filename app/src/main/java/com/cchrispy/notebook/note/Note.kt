package com.cchrispy.notebook.note

import android.util.Log
import com.cchrispy.notebook.stack.Stack
import java.util.*

/**
 * Created by chrischiang on 2/26/18.
 *
 * Note contains a title and a body.
 * Note contains a date created and date to notify (which also specifies the time)
 * Note contains a category tag.
 * Note contains a reference to the containing Stacks.
 */
open class Note {

    private var TAG = "Note"

    var title:          String?     = null
    var text:           String?     = null
    var dateNotify:     Date?       = null
    var dateCreated:    Date?       = null
    var category:       Category?   = null
    var starred:        Boolean     = false
    var stacks:         MutableSet<Stack> = mutableSetOf()

    open fun getDateNotifyFormatted(date: Date) = "TODO" // TODO

    open fun getDateCreatedFormatted(date: Date) = "TODO" // TODO

    open fun addToStack(stack: Stack) {
        if (stack.containsNote(this)) {
            Log.w(TAG, "Note already exists in stack.")
            return
        }
        stacks.add(stack)
        stack.addNote(this)
    }

    open fun removeFromStack(stack: Stack) {
        if (stack.containsNote(this)) {
            Log.w(TAG, "Note does not exist in stack.")
            return
        }
        stacks.remove(stack)
        stack.removeNote(this)
    }

    open fun getStackCount() = stacks.size

    open fun isInStack(stack: Stack) = stacks.contains(stack)

    open fun pin() = "TODO" // TODO
    open fun unpin() = "TODO" // TODO
}