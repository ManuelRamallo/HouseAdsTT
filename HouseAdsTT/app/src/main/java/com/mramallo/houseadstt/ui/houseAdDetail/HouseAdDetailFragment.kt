package com.mramallo.houseadstt.ui.houseAdDetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import coil.load
import com.mramallo.houseadstt.databinding.FragmentHouseAdDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HouseAdDetailFragment : Fragment() {

    private lateinit var binding: FragmentHouseAdDetailBinding
    private val viewModel: HouseAdDetailViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHouseAdDetailBinding.inflate(inflater, container, false)
        return binding.constraint.rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getHouseDetail()
        setupObservers()
    }

    private fun setupObservers() {
        viewModel.stateHouseDetail.observe(viewLifecycleOwner) { houseDetail ->
            houseDetail?.let {
                binding.ivImageHouse.load(houseDetail.multimedia.images[4].url)
                binding.tvRoomsHouse.text = houseDetail.moreCharacteristics.roomNumber.toString() + " rooms"
                binding.tvBathroomsHouse.text = houseDetail.moreCharacteristics.bathNumber.toString() + " bathrooms"
                binding.tvStateHouse.text = houseDetail.state
                binding.tvEnergyHouse.text = houseDetail.energyCertification.title + ": " + houseDetail.energyCertification.energyConsumption.type
                binding.tvFloorsHouse.text = houseDetail.moreCharacteristics.floor + " floors"
                binding.tvCommunityHouse.text = "Community costs: " + houseDetail.moreCharacteristics.communityCosts.toString() + " €"
                binding.tvStatusHouse.text = houseDetail.moreCharacteristics.status
                binding.tvDescriptionHouse.text = houseDetail.propertyComment
                binding.tvPropertyTypeHouse.text = houseDetail.propertyType

            }
        }
    }
}