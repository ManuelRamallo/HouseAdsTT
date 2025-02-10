package com.mramallo.houseadstt.data.remote.api

import com.mramallo.houseadstt.data.remote.dto.HouseDetailDto
import com.mramallo.houseadstt.data.remote.dto.HouseItemDto
import retrofit2.Response
import retrofit2.http.GET

interface HousesApi {

    @GET("list.json")
    suspend fun getAllHouses(): Response<List<HouseItemDto>>

    @GET("detail.json")
    suspend fun getHouseDetail(): Response<HouseDetailDto>

}