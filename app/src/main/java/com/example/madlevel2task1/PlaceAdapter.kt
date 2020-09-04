package com.example.madlevel2task1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.madlevel2task1.databinding.ItemPlaceBinding

class PlaceAdapter(private val places: List<Place>) :
    RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {


    /**
     * create viewholder and return. infaltes the layout item_place.xml
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_place, parent, false)
        )
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val binding = ItemPlaceBinding.bind(itemView)

        fun databind(place: Place) {
            binding.ivPlace.setImageResource(place.imageResId)
            binding.tvPlace.text = place.name
        }
    }

    /**
     * get the size of amount of items in the list
     */
    override fun getItemCount(): Int {
        return places.size
    }

    /**
     * get position and display data
     */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.databind(places[position])
    }
}