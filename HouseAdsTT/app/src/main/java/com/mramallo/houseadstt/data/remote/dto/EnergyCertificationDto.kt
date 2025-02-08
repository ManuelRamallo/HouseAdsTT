package com.mramallo.houseadstt.data.remote.dto

data class EnergyCertificationDto(
    val title: String?,
    val energyConsumption: EnergyConsumptionDto?,
    val emissions: EmissionsDto?,
)
