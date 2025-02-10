package com.mramallo.houseadstt.ui.housesAds

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mramallo.houseadstt.domain.entity.HouseItem
import com.mramallo.houseadstt.domain.usecase.GetHousesListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HousesAdsViewModel @Inject constructor(
    private val getHousesListUseCase: GetHousesListUseCase
): ViewModel() {

    val stateHousesAdsList = MutableLiveData<List<HouseItem>?>()
    val isLoading = MutableLiveData<Boolean>()

    fun getHousesAdsList() {
        viewModelScope.launch {
            isLoading.postValue(true)
            stateHousesAdsList.postValue(getHousesListUseCase.invoke())
            isLoading.postValue(false)
        }
    }

}