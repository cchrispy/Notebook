package com.cchrispy.notebook.book

import com.cchrispy.notebook.stack.Stack
import com.cchrispy.notebook.util.formatDate
import java.util.*

/**
 * Created by chrischiang on 2/27/18.
 */
open class Book {

    var title: String? = null
    var stacks: List<Stack>? = null
    var date: Date? = null

}