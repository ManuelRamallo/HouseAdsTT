package com.mramallo.houseadstt.data.mappers

import com.mramallo.houseadstt.data.remote.dto.EmissionsDto
import com.mramallo.houseadstt.data.remote.dto.EnergyCertificationDto
import com.mramallo.houseadstt.data.remote.dto.EnergyConsumptionDto
import com.mramallo.houseadstt.data.remote.dto.HouseDetailDto
import com.mramallo.houseadstt.data.remote.dto.MoreCharacteristicsDto
import com.mramallo.houseadstt.data.remote.dto.UbicationDto
import com.mramallo.houseadstt.domain.entity.Emissions
import com.mramallo.houseadstt.domain.entity.EnergyCertification
import com.mramallo.houseadstt.domain.entity.EnergyConsumption
import com.mramallo.houseadstt.domain.entity.HouseDetail
import com.mramallo.houseadstt.domain.entity.MoreCharacteristics
import com.mramallo.houseadstt.domain.entity.Multimedia
import com.mramallo.houseadstt.domain.entity.PriceInfo
import com.mramallo.houseadstt.domain.entity.Ubication

fun HouseDetailDto.toHouseDetail(): HouseDetail {
    return HouseDetail(
        adid = adid ?: 0,
        price = price ?: 0F,
        priceInfo = priceInfo?.toPriceInfo() ?: PriceInfo.getEmpty(),
        operation = operation ?: "",
        propertyType = propertyType ?: "",
        extendedPropertyType = extendedPropertyType ?: "",
        homeType = homeType ?: "",
        state = state ?: "",
        multimedia = multimedia?.toMultimedia() ?: Multimedia.getEmpty(),
        propertyComment = propertyComment ?: "",
        ubication = ubication?.toUbication() ?: Ubication.getEmpty(),
        country = country ?: "",
        moreCharacteristics = moreCharacteristics?.toMoreCharacteristics() ?: MoreCharacteristics.getEmpty(),
        energyCertification = energyCertification?.toEnergyCertification() ?: EnergyCertification.getEmpty()
    )
}

fun UbicationDto.toUbication(): Ubication {
    return Ubication(
        latitude = latitude ?: 0.0,
        longitude = longitude ?: 0.0
    )
}

fun MoreCharacteristicsDto.toMoreCharacteristics(): MoreCharacteristics {
    return MoreCharacteristics(
        communityCosts = communityCosts ?: 0F,
        roomNumber = roomNumber ?: 0,
        bathNumber = bathNumber ?: 0,
        exterior = exterior ?: false,
        housingFurnitures = housingFurnitures ?: "",
        agencyIsABank = agencyIsABank ?: false,
        energyCertificationType = energyCertificationType ?: "",
        flatLocation = flatLocation ?: "",
        modificationDate = modificationDate ?: 0,
        constructedArea = constructedArea ?: 0,
        lift = lift ?: false,
        boxroom = boxroom ?: false,
        isDuplex = isDuplex ?: false,
        floor = floor ?: "",
        status = status ?: ""
    )
}

fun EnergyCertificationDto.toEnergyCertification(): EnergyCertification {
    return EnergyCertification(
        title = title ?: "",
        energyConsumption = energyConsumption?.toEnergyConsumption() ?: EnergyConsumption.getEmpty(),
        emissions = emissions?.toEmissions() ?: Emissions.getEmpty()
    )
}

fun EnergyConsumptionDto.toEnergyConsumption(): EnergyConsumption {
    return EnergyConsumption(
        type = type ?: ""
    )
}

fun EmissionsDto.toEmissions(): Emissions {
    return Emissions(
        type = type ?: ""
    )
}
