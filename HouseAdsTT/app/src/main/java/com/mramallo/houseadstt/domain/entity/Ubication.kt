package com.mramallo.houseadstt.domain.entity

data class Ubication(
    val latitude: Double,
    val longitude: Double,
) {
    companion object {
        fun getEmpty(): Ubication {
            return Ubication(
                latitude = 0.0,
                longitude = 0.0
            )
        }
    }
}
