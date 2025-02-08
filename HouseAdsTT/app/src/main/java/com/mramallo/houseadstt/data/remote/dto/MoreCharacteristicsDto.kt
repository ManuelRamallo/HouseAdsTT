package com.mramallo.houseadstt.data.remote.dto

data class MoreCharacteristicsDto(
    val communityCosts: Float?,
    val roomNumber: Int?,
    val bathNumber: Int?,
    val exterior: Boolean?,
    val housingFurnitures: String?,
    val agencyIsABank: Boolean?,
    val energyCertificationType: String?,
    val flatLocation: String?,
    val modificationDate: Int?,
    val constructedArea: Int?,
    val lift: Boolean?,
    val boxroom:  Boolean?,
    val isDuplex: Boolean?,
    val floor: String?,
    val status: String?
)
