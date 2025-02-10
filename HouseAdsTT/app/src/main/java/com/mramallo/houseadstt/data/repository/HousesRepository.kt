package com.mramallo.houseadstt.data.repository

import com.mramallo.houseadstt.data.remote.api.HousesApi
import com.mramallo.houseadstt.data.remote.dto.HouseDetailDto
import com.mramallo.houseadstt.data.remote.dto.HouseItemDto
import javax.inject.Inject

class HousesRepository @Inject constructor(
    private val housesApi: HousesApi
) {

    suspend fun getAllHouses(): List<HouseItemDto>? {
        val response = housesApi.getAllHouses()
        return if(response.isSuccessful) {
            response.body()
        } else {
            listOf()
        }
    }

    suspend fun getHouseDetail(): HouseDetailDto? {
        val response = housesApi.getHouseDetail()
        return response.body()
    }

}