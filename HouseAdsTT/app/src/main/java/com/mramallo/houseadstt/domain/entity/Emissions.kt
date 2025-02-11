package com.mramallo.houseadstt.domain.entity

data class Emissions(
    val type: String
) {
    companion object {
        fun getMock(): Emissions = Emissions(
            type = "e"
        )
        fun getEmpty(): Emissions = Emissions(
            type = ""
        )
    }
}
