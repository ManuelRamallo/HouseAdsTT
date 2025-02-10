package com.mramallo.houseadstt.domain.usecase

import com.mramallo.houseadstt.data.mappers.toHousesList
import com.mramallo.houseadstt.data.repository.HousesRepository
import javax.inject.Inject

class GetHousesListUseCase @Inject constructor(
    private val housesRepository: HousesRepository
) {

    suspend operator fun invoke() = housesRepository.getAllHouses()?.toHousesList()

}