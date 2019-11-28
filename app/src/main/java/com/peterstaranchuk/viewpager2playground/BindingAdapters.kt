package com.peterstaranchuk.viewpager2playground

import android.graphics.Color
import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter("app:color")
fun setBackgroundColorFromColorString(view: View, color: String) {
    view.setBackgroundColor(Color.parseColor(color))
}