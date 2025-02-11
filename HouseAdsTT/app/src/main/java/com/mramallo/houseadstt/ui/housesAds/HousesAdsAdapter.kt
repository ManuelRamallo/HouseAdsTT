package com.mramallo.houseadstt.ui.housesAds

import android.graphics.drawable.Icon
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.mramallo.houseadstt.R
import com.mramallo.houseadstt.databinding.ItemHouseListBinding
import com.mramallo.houseadstt.domain.entity.HouseItem
import com.mramallo.houseadstt.ui.components.DisplayFeaturesHouse
import com.mramallo.houseadstt.utils.convertMillisToDate
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
            binding.tvTitleHouse.text = if(houseItem.operation == "rent") "For rent" else "For sale"
            binding.tvPriceHouse.text = "${houseItem.priceInfo.price.amount.formatPrice()} ${houseItem.priceInfo.price.currencySuffix}"

            // Location
            binding.tvLocationHouse.text = houseItem.address.replaceFirstChar {
                if (it.isLowerCase()) it.titlecase(
                    Locale.ROOT
                ) else it.toString()
            } + ", " + houseItem.municipality

            // Compose View - Features
            binding.composeView.setContent {
                DisplayFeaturesHouse(houseItem = houseItem)
            }

            itemView.setOnClickListener { onClickItemListener() }
            setFavoriteHouse(binding)


        }
    }
}

fun setFavoriteHouse(binding: ItemHouseListBinding){
    var isFavorite = false
    var dateFavorite = ""

    binding.imageButton.setOnClickListener {
        isFavorite = !isFavorite
        binding.imageButton.setImageResource(if (isFavorite) R.drawable.star_on else R.drawable.start_off)
        dateFavorite = if (isFavorite) {
            System.currentTimeMillis().convertMillisToDate()
        } else {
            ""
        }
        binding.tvDateFavorite.visibility = if (isFavorite) View.VISIBLE else View.GONE
        binding.tvDateFavorite.text = dateFavorite
    }
}