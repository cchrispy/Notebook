package com.cchrispy.notebook.stack.views

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import com.cchrispy.notebook.R

/**
 * Created by chrischiang on 2/26/18.
 */
class StackView(ctx: Context, attrs: AttributeSet? = null, defStyle: Int = 0) : ConstraintLayout(ctx, attrs, defStyle) {

    init {
        inflate(ctx, R.layout.stack, this)
    }

}