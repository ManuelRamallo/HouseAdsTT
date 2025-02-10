package com.mramallo.houseadstt.domain.entity

data class Features(
    val hasAirConditioning: Boolean,
    val hasBoxRoom: Boolean
) {
    companion object {
        fun getMock() = Features(
            hasAirConditioning = true,
            hasBoxRoom = true
        )
        fun getEmpty() = Features(
            hasAirConditioning = false,
            hasBoxRoom = false
        )
    }
}
