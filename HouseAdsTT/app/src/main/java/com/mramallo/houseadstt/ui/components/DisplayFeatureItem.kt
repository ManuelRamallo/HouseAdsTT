package com.mramallo.houseadstt.ui.components

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DisplayFeatureItem(
    icon: Int,
    value: String,
    modifier: Modifier = Modifier
) {
    Icon(
        painter = painterResource(icon),
        contentDescription = null,
        modifier = modifier.size(20.dp)
    )
    Text(
        text = value,
        fontSize = 14.sp,
        fontWeight = FontWeight.W400
    )
}