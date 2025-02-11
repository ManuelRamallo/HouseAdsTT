package com.mramallo.houseadstt.utils

import java.text.NumberFormat
import java.util.Locale

fun Float.formatPrice(): String {
    val formatter = NumberFormat.getNumberInstance(Locale.getDefault())
    return formatter.format(this)
}