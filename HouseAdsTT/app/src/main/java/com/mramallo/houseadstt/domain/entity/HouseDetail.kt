package com.mramallo.houseadstt.domain.entity

data class HouseDetail(
    val adid: Int,
    val price: Float,
    val priceInfo: PriceInfo,
    val operation: String,
    val propertyType: String,
    val extendedPropertyType: String,
    val homeType: String,
    val state: String,
    val multimedia: Multimedia,
    val propertyComment: String,
    val ubication: Ubication,
    val country: String,
    val moreCharacteristics: MoreCharacteristics,
    val energyCertification: EnergyCertification,
)
