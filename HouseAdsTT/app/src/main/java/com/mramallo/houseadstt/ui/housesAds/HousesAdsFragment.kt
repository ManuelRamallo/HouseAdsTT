package com.mramallo.houseadstt.ui.housesAds

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.mramallo.houseadstt.R
import com.mramallo.houseadstt.databinding.FragmentHousesAdsBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class HousesAdsFragment : Fragment() {

    private val viewModel: HousesAdsViewModel by viewModels()
    private lateinit var binding: FragmentHousesAdsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHousesAdsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getHousesAdsList()
        setupRecyclerViewAndObservers()
    }

    private fun setupRecyclerViewAndObservers() {
        val manager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        binding.rvHouses.layoutManager = manager
        viewModel.stateHousesAdsList.observe(viewLifecycleOwner) {
            binding.rvHouses.adapter = HousesAdsAdapter(it!!) {
                onHouseClickedToDetail()
            }
        }

        viewModel.isLoading.observe(viewLifecycleOwner) {
            binding.progress.isVisible = it
        }
    }

    private fun onHouseClickedToDetail() {
        findNavController().navigate(R.id.action_housesAdsFragment_to_houseAdDetailFragment)
    }


}