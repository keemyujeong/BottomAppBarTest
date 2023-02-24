package com.example.bottomappbartest

import android.content.Context
import android.util.AttributeSet
import android.view.ViewGroup
import com.google.android.material.bottomnavigation.BottomNavigationView

class NoneClickBNV @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null
) : BottomNavigationView(context, attrs) {

    init{
        val menuView = getChildAt(0) as ViewGroup
        menuView.getChildAt(2).isClickable = false
    }

}