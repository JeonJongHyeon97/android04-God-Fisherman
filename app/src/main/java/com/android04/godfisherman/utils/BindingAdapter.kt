package com.android04.godfisherman.utils

import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.databinding.BindingAdapter

object BindingAdapter {
    @JvmStatic
    @BindingAdapter("setRect")
    fun setViewWithRect(view: View, rect: List<Int>?) {
        if (rect != null && rect.size == 4) {
            view.top = rect[0]
            view.bottom = rect[1]
            view.left = rect[2]
            view.right = rect[3]
            view.visibility = View.VISIBLE
        } else {
            view.visibility = View.GONE
        }
    }

    @JvmStatic
    @BindingAdapter("setBodySize")
    fun setBodySizeWithFloat(view: TextView, size: Float?) {
        if (size == null) {
            view.visibility = View.GONE
        } else {
            view.visibility = View.VISIBLE
            view.text = size.toString() + "배"
        }
    }

    @JvmStatic
    @BindingAdapter("setStopwatchBtnText")
    fun setStopwatchBtnText(view: AppCompatButton, isStarted: Boolean?) {
        if (isStarted == true) {
            view.text = "Stop"
        } else {
            view.text = "Start"
        }
    }
}