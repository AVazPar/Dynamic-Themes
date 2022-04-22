package com.avazpar.dynamicThemes.ui.components

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import com.avazpar.dynamicThemes.R

class Header1 @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = R.attr.header1Style
) : AppCompatTextView(context, attrs, defStyle)

class Header2 @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = R.attr.header2Style
) : AppCompatTextView(context, attrs, defStyle)