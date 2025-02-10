package com.mramallo.houseadstt.domain.entity

data class MoreCharacteristics(
    val communityCosts: Float,
    val roomNumber: Int,
    val bathNumber: Int,
    val exterior: Boolean,
    val housingFurnitures: String,
    val agencyIsABank: Boolean,
    val energyCertificationType: String,
    val flatLocation: String,
    val modificationDate: Double,
    val constructedArea: Int,
    val lift: Boolean,
    val boxroom:  Boolean,
    val isDuplex: Boolean,
    val floor: String,
    val status: String
) {
    companion object {
        fun getEmpty(): MoreCharacteristics = MoreCharacteristics(
            communityCosts = 0F,
            roomNumber = 0,
            bathNumber = 0,
            exterior = false,
            housingFurnitures = "",
            agencyIsABank = false,
            energyCertificationType = "",
            flatLocation = "",
            modificationDate = 0.0,
            constructedArea = 0,
            lift = false,
            boxroom = false,
            isDuplex = false,
            floor = "",
            status = ""
        )
    }
}
