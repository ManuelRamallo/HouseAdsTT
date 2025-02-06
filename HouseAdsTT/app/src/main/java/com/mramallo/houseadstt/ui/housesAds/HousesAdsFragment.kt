package com.mramallo.houseadstt.ui.housesAds

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mramallo.houseadstt.R
import com.mramallo.houseadstt.databinding.FragmentHousesAdsBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class HousesAdsFragment : Fragment() {

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

    }
}