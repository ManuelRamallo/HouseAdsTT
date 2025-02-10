package com.mramallo.houseadstt.domain.usecase

import com.mramallo.houseadstt.data.mappers.toHouseDetail
import com.mramallo.houseadstt.data.repository.HousesRepository
import jakarta.inject.Inject

class GetHouseDetailUseCase @Inject constructor(
    private val housesRepository: HousesRepository
) {

    suspend operator fun invoke() = housesRepository.getHouseDetail()?.toHouseDetail()

}