package com.mramallo.houseadstt.domain.entity

data class EnergyConsumption(
    val type: String
) {
    companion object {
        fun getEmpty(): EnergyConsumption = EnergyConsumption(
            type = ""
        )
    }
}
