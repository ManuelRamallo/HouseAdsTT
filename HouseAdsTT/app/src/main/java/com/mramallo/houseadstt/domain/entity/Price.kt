package com.mramallo.houseadstt.domain.entity

data class Price(
    val amount: Float,
    val currencySuffix: String,
) {
    companion object {
        fun getMock() = Price(
            amount = 1F,
            currencySuffix = "€"
        )
        fun getEmpty() = Price(
            amount = 0F,
            currencySuffix = ""
        )
    }
}
