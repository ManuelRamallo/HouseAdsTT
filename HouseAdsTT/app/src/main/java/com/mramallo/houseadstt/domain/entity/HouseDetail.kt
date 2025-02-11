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
) {
    companion object {
        fun getMock(): HouseDetail {
            return HouseDetail(
                adid = 1,
                price = 1195000f,
                priceInfo = PriceInfo.getMock(),
                operation = "sale",
                propertyType = "flat",
                extendedPropertyType = "flat",
                homeType = "flat",
                state = "state",
                multimedia = Multimedia.getMock(),
                propertyComment = "propertyComment",
                ubication = Ubication.getMock(),
                country = "country",
                moreCharacteristics = MoreCharacteristics.getMock(),
                energyCertification = EnergyCertification.getMock(),
            )
        }
    }
}
