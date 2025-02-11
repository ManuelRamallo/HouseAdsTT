package com.mramallo.houseadstt.utils

import java.text.NumberFormat
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

fun Float.formatPrice(): String {
    val formatter = NumberFormat.getNumberInstance(Locale.getDefault())
    return formatter.format(this)
}

fun Long.convertMillisToDate(): String {
    val sdf = SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.getDefault())
    return sdf.format(Date(this))
}