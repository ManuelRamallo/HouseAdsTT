package com.mramallo.houseadstt.ui.housesAds

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.mramallo.houseadstt.databinding.ItemHouseListBinding
import com.mramallo.houseadstt.domain.entity.HouseItem

class HousesAdsAdapter(
    private val housesList: List<HouseItem>,
    private val onClickItemListener: () -> Unit
): RecyclerView.Adapter<HousesAdsAdapter.HousesAdsViewHolder>() {


    private lateinit var binding: ItemHouseListBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HousesAdsViewHolder {
        binding = ItemHouseListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HousesAdsViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: HousesAdsViewHolder, position: Int) {
        val item = housesList[position]
        holder.render(item, onClickItemListener)
    }

    override fun getItemCount(): Int = housesList.size

    class HousesAdsViewHolder(view: View): RecyclerView.ViewHolder(view) {
        private val binding = ItemHouseListBinding.bind(view)

        fun render(houseItem: HouseItem, onClickItemListener: () -> Unit) {
            binding.ivImageHouse.load(houseItem.thumbnail)
            binding.tvTitleHouse.text = if(houseItem.operation == "rent") "Alquiler" else "Venta"
            binding.tvPriceHouse.text = "${houseItem.priceInfo.price.amount} ${houseItem.priceInfo.price.currencySuffix}"
            binding.tvLocationHouse.text = houseItem.address + ", " + houseItem.municipality
            binding.tvRoomsHouse.text = houseItem.rooms.toString()
            binding.tvBathroomsHouse.text = houseItem.bathrooms.toString()
            binding.tvSizeHouse.text = houseItem.size.toString() + " m2"


            itemView.setOnClickListener { onClickItemListener() }
        }
    }
}