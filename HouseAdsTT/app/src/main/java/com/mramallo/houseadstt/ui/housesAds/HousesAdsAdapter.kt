package com.mramallo.houseadstt.ui.housesAds

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.mramallo.houseadstt.databinding.ItemHouseListBinding
import com.mramallo.houseadstt.domain.entity.HouseItem
import com.mramallo.houseadstt.utils.formatPrice
import java.util.Locale

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
            // Image, title and price
            binding.ivImageHouse.load(houseItem.thumbnail)
            binding.tvTitleHouse.text = if(houseItem.operation == "rent") "En alquiler" else "En venta"
            binding.tvPriceHouse.text = "${houseItem.priceInfo.price.amount.formatPrice()} ${houseItem.priceInfo.price.currencySuffix}"

            // Location
            binding.tvLocationHouse.text = houseItem.address.replaceFirstChar {
                if (it.isLowerCase()) it.titlecase(
                    Locale.ROOT
                ) else it.toString()
            } + ", " + houseItem.municipality

            // Features
            binding.tvRoomsHouse.text = houseItem.rooms.toString() + " Habitaciones"
            binding.tvBathroomsHouse.text = houseItem.bathrooms.toString() + " Baños"
            binding.tvSizeHouse.text = houseItem.size.toString() + " m²"


            itemView.setOnClickListener { onClickItemListener() }
        }
    }
}