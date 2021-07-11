package com.example.blueeye.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.blueeye.R
import com.example.blueeye.data.model.ResponseList
import com.example.blueeye.utils.WeatherUtils
import kotlinx.android.synthetic.main.forecast_list_item_row.view.*

class ForecastAdapter: RecyclerView.Adapter<ForecastAdapter.WeatherViewHolder>() {

    inner class WeatherViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    private val differItemCallback = object : DiffUtil.ItemCallback<ResponseList>(){
        override fun areItemsTheSame(oldItem: ResponseList, newItem: ResponseList): Boolean {
            return oldItem.dt == newItem.dt
        }

        override fun areContentsTheSame(oldItem: ResponseList, newItem: ResponseList): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differItemCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherViewHolder {
        return WeatherViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.forecast_list_item_row, parent, false)
        )
    }

    // "https://openweathermap.org/img/wn/${weatherPosition.icon}.png"

    override fun onBindViewHolder(holderWeather: WeatherViewHolder, position: Int) {
        val responseList = differ.currentList[position]
        holderWeather.itemView.apply {
            val weatherIcon = responseList.weather[0].icon
            val customWeatherIcon = WeatherUtils.customIcons(weatherIcon)
            Glide.with(this).load(customWeatherIcon).into(img_icon_bottom_sheet)
            txt_degree_bottom_sheet.text = responseList.main.temp.toString()
            txt_day_name_bottom_sheet.text = responseList.dtText
            txt_calendar_bottom_sheet.text = responseList.dtText

            setOnClickListener {
                onItemClickListener?.let { it(responseList) }
            }
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    private var onItemClickListener: ((ResponseList) -> Unit)? = null

    fun setOnItemClickListener(listener: (ResponseList) -> Unit){
        onItemClickListener = listener
    }
}