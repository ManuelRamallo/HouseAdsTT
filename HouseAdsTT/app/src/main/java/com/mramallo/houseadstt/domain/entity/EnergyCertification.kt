package com.mramallo.houseadstt.domain.entity

data class EnergyCertification(
    val title: String,
    val energyConsumption: EnergyConsumption,
    val emissions: Emissions,
) {
    companion object {
        fun getEmpty(): EnergyCertification = EnergyCertification(
            title = "",
            energyConsumption = EnergyConsumption.getEmpty(),
            emissions = Emissions.getEmpty()
        )
    }
}
