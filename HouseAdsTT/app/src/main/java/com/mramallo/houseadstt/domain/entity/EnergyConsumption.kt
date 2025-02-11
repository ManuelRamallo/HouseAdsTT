package com.mramallo.houseadstt.domain.entity

data class EnergyConsumption(
    val type: String
) {
    companion object {
        fun getMock(): EnergyConsumption = EnergyConsumption(
            type = "e"
        )
        fun getEmpty(): EnergyConsumption = EnergyConsumption(
            type = ""
        )
    }
}
