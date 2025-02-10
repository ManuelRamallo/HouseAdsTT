package com.mramallo.houseadstt.ui.houseAdDetail

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mramallo.houseadstt.domain.entity.HouseDetail
import com.mramallo.houseadstt.domain.usecase.GetHouseDetailUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class HouseAdDetailViewModel @Inject constructor(
    private val getHouseDetailUseCase: GetHouseDetailUseCase
): ViewModel() {

    val stateHouseDetail = MutableLiveData<HouseDetail?>()

    fun getHouseDetail() {
        viewModelScope.launch {
            stateHouseDetail.postValue(getHouseDetailUseCase.invoke())
        }
    }

}