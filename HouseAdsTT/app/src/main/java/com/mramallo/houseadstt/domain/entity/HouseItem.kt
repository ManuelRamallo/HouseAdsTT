package com.mramallo.houseadstt.domain.entity

data class HouseItem(
    val propertyCode: String,
    val thumbnail: String,
    val floor: String,
    val price: Float,
    val priceInfo: PriceInfo,
    val propertyType: String,
    val operation: String,
    val size: Float,
    val exterior: Boolean,
    val rooms: Int,
    val bathrooms: Int,
    val address: String,
    val province: String,
    val municipality: String,
    val district: String,
    val country: String,
    val neighborhood: String,
    val latitude: Double,
    val longitude: Double,
    val description: String,
    val multimedia: Multimedia,
    val features: Features
)
