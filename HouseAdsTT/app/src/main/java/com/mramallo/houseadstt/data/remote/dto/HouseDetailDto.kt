package com.mramallo.houseadstt.data.remote.dto

data class HouseDetailDto(
    val adid: Int?,
    val price: Float?,
    val priceInfo: PriceInfoDto,
    val operation: String?,
    val propertyType: String?,
    val extendedPropertyType: String?,
    val homeType: String?,
    val state: String?,
    val multimedia: MultimediaDto,
    val propertyComment: String?,
    val ubication: UbicationDto?,
    val country: String?,
    val moreCharacteristics: MoreCharacteristicsDto?,
    val energyCertification: EnergyCertificationDto?,
)
