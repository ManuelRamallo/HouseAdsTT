package com.mramallo.houseadstt.domain.entity

data class Ubication(
    val latitude: Double,
    val longitude: Double,
) {
    companion object {
        fun getMock(): Ubication {
            return Ubication(
                latitude = 40.4362687,
                longitude = -3.6833686
            )
        }
        fun getEmpty(): Ubication {
            return Ubication(
                latitude = 0.0,
                longitude = 0.0
            )
        }
    }
}
