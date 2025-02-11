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
        fun getMock(): MoreCharacteristics = MoreCharacteristics(
            communityCosts = 330F,
            roomNumber = 3,
            bathNumber = 2,
            exterior = false,
            housingFurnitures = "unknown",
            agencyIsABank = false,
            energyCertificationType = "e",
            flatLocation = "internal",
            modificationDate = 1727683968000.0,
            constructedArea = 133,
            lift = true,
            boxroom = false,
            isDuplex = false,
            floor = "2",
            status = "renew"
        )
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
