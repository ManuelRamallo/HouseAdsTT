package com.mramallo.houseadstt.domain.entity

data class Emissions(
    val type: String
) {
    companion object {
        fun getEmpty(): Emissions = Emissions(
            type = ""
        )
    }
}
