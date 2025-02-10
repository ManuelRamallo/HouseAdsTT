package com.mramallo.houseadstt.data.mappers

import com.mramallo.houseadstt.data.remote.dto.FeaturesDto
import com.mramallo.houseadstt.data.remote.dto.HouseItemDto
import com.mramallo.houseadstt.data.remote.dto.ImageDto
import com.mramallo.houseadstt.data.remote.dto.MultimediaDto
import com.mramallo.houseadstt.data.remote.dto.PriceDto
import com.mramallo.houseadstt.data.remote.dto.PriceInfoDto
import com.mramallo.houseadstt.domain.entity.Features
import com.mramallo.houseadstt.domain.entity.HouseItem
import com.mramallo.houseadstt.domain.entity.Image
import com.mramallo.houseadstt.domain.entity.Multimedia
import com.mramallo.houseadstt.domain.entity.Price
import com.mramallo.houseadstt.domain.entity.PriceInfo


fun List<HouseItemDto>.toHousesList(): List<HouseItem> {
    return this.map { it.toHouseItem() }
}


fun HouseItemDto.toHouseItem(): HouseItem {
    return HouseItem(
        propertyCode = propertyCode ?: "",
        thumbnail = thumbnail ?: "",
        floor = floor ?: "",
        price = price ?: 0F,
        priceInfo = priceInfo?.toPriceInfo() ?: PriceInfo.getEmpty(),
        propertyType = propertyType ?: "",
        operation = operation ?: "",
        size = size ?: 0F,
        exterior = exterior ?: false,
        rooms = rooms ?: 0,
        bathrooms = bathrooms ?: 0,
        address = address ?: "",
        province = province ?: "",
        municipality = municipality ?: "",
        district = district ?: "",
        country = country ?: "",
        neighborhood = neighborhood ?: "",
        latitude = latitude ?: 0.0,
        longitude = longitude ?: 0.0,
        description = description ?: "",
        multimedia = multimedia?.toMultimedia() ?: Multimedia.getEmpty(),
        features = features?.toFeatures() ?: Features.getEmpty()
    )
}

fun PriceInfoDto.toPriceInfo(): PriceInfo {
    return PriceInfo(
        price = price?.toPrice() ?: Price.getEmpty()
    )
}

fun PriceDto.toPrice(): Price {
    return Price(
        amount = amount ?: 0F,
        currencySuffix = currencySuffix ?: ""
    )
}

fun MultimediaDto.toMultimedia(): Multimedia {
    return Multimedia(
        images = images?.map { it.toImage() } ?: listOf()
    )
}

fun ImageDto.toImage(): Image {
    return Image(
        url = url ?: "",
        tag = tag ?: ""
    )
}

fun FeaturesDto.toFeatures(): Features {
    return Features(
        hasAirConditioning = hasAirConditioning ?: false,
        hasBoxRoom = hasBoxRoom ?: false
    )
}


