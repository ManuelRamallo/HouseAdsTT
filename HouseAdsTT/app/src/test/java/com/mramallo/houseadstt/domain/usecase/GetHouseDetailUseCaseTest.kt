package com.mramallo.houseadstt.domain.usecase

import com.mramallo.houseadstt.data.mappers.toHouseDetail
import com.mramallo.houseadstt.data.mappers.toHousesList
import com.mramallo.houseadstt.data.remote.dto.EmissionsDto
import com.mramallo.houseadstt.data.remote.dto.EnergyCertificationDto
import com.mramallo.houseadstt.data.remote.dto.EnergyConsumptionDto
import com.mramallo.houseadstt.data.remote.dto.FeaturesDto
import com.mramallo.houseadstt.data.remote.dto.HouseDetailDto
import com.mramallo.houseadstt.data.remote.dto.HouseItemDto
import com.mramallo.houseadstt.data.remote.dto.ImageDto
import com.mramallo.houseadstt.data.remote.dto.MoreCharacteristicsDto
import com.mramallo.houseadstt.data.remote.dto.MultimediaDto
import com.mramallo.houseadstt.data.remote.dto.PriceDto
import com.mramallo.houseadstt.data.remote.dto.PriceInfoDto
import com.mramallo.houseadstt.data.repository.HousesRepository
import com.mramallo.houseadstt.domain.entity.Features
import com.mramallo.houseadstt.domain.entity.HouseDetail
import com.mramallo.houseadstt.domain.entity.HouseItem
import com.mramallo.houseadstt.domain.entity.Image
import com.mramallo.houseadstt.domain.entity.Multimedia
import com.mramallo.houseadstt.domain.entity.PriceInfo
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.impl.annotations.RelaxedMockK
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test


class GetHouseDetailUseCaseTest {

    @RelaxedMockK
    private lateinit var housesRepository: HousesRepository

    private lateinit var getHouseDetailUseCase: GetHouseDetailUseCase

    @Before
    fun onBefore() {
        MockKAnnotations.init(this)
        getHouseDetailUseCase = GetHouseDetailUseCase(housesRepository)
    }

    @Test
    fun `when the api return something then get values from api`() = runBlocking {
        // Given
        val houseDetail = getHouseDetailDtoMock()
        coEvery { housesRepository.getHouseDetail() } returns houseDetail

        // When
        val response = getHouseDetailUseCase()

        // Then
        assert(houseDetail.toHouseDetail() == response)
    }

}


fun getHouseDetailMock(): HouseDetail {
    return HouseDetail.getMock()
}

fun getHouseDetailDtoMock(): HouseDetailDto {
    return HouseDetailDto(
        adid = 1,
        price = 1195000f,
        priceInfo = PriceInfoDto(
            PriceDto(
                amount = 1195000F, currencySuffix = "€"
            )
        ),
        operation = "sale",
        propertyType = "flat",
        extendedPropertyType = "flat",
        homeType = "flat",
        state = "state",
        multimedia = MultimediaDto(
            listOf(
                ImageDto(
                    url = "https://img4.idealista.com/blur/WEB_LISTING-M/0/id.pro.es.image.master/58/60/32/1273036727.webp",
                    tag = "livingRoom"
                ),
                ImageDto(
                    url = "https://img4.idealista.com/blur/WEB_LISTING-M/0/id.pro.es.image.master/58/60/32/1273036727.webp",
                    tag = "livingRoom"
                ),
            )
        ),
        propertyComment = "propertyComment",
        ubication = null,
        country = "country",
        moreCharacteristics = MoreCharacteristicsDto(
            communityCosts = 330.0f,
            roomNumber = 3,
            bathNumber = 2,
            exterior = false,
            housingFurnitures = "unknown",
            agencyIsABank = false,
            energyCertificationType = "e",
            flatLocation = "internal",
            modificationDate = 1727683968000.0,
            constructedArea = 133,
            lift = true,
            boxroom = false,
            isDuplex = false,
            floor = "2",
            status = "renew"
        ),
        energyCertification = EnergyCertificationDto(
            title = "Certificado energético",
            energyConsumption = EnergyConsumptionDto(
                type = "e"
            ),
            emissions = EmissionsDto(
                type = "e"
            )
        )
    )
}
