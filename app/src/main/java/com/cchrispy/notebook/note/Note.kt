package com.cchrispy.notebook.note

import java.util.*

/**
 * Created by chrischiang on 2/26/18.
 *
 * Note contains a title and a body.
 * Note contains a date created and date to notify (which also specifies the time)
 * Note contains a category tag.
 */
open class Note {

    var title:          String? = null
    var text:           String? = null
    var dateNotify:     Date?   = null
    var dateCreated:    Date?   = null
    var category:       Category? = null

    open fun getDateNotifyFormatted(date: Date) = "TODO" // TODO

    open fun getDateCreatedFormatted(date: Date) = "TODO" // TODO

}