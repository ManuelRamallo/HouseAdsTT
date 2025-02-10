package com.mramallo.houseadstt.domain.entity

data class PriceInfo(
    val price: Price
) {
    companion object {
        fun getMock() = PriceInfo(
            price = Price.getMock()
        )
        fun getEmpty() = PriceInfo(
            price = Price.getEmpty()
        )
    }
}
