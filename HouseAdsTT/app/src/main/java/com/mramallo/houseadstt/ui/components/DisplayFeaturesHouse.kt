package com.mramallo.houseadstt.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mramallo.houseadstt.R
import com.mramallo.houseadstt.domain.entity.HouseItem

@Composable
fun DisplayFeaturesHouse(houseItem: HouseItem){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        DisplayFeatureItem(
            icon = R.drawable.rooms,
            value = houseItem.rooms.toString() + " Rooms",
            modifier = Modifier.align(Alignment.CenterVertically)
        )
        Spacer(modifier = Modifier.width(8.dp))

        DisplayFeatureItem(
            icon = R.drawable.bath,
            value = houseItem.bathrooms.toString() + " Bathrooms",
            modifier = Modifier.align(Alignment.CenterVertically)
        )

        Spacer(modifier = Modifier.width(8.dp))

        DisplayFeatureItem(
            icon = R.drawable.size,
            value = houseItem.size.toString() + " m²",
            modifier = Modifier.align(Alignment.CenterVertically)
        )

    }
}