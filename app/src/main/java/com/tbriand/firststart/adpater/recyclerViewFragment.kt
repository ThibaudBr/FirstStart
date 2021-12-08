package com.tbriand.firststart.adpater

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tbriand.firststart.ProductActivity
import com.tbriand.firststart.R
import com.tbriand.firststart.model.Product


class RecyclerViewFragment(
    private val context: Context,
    private val dataset: List<Product>
) : RecyclerView.Adapter<RecyclerViewFragment.ItemViewHolder>() {

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.name)
        val brand: TextView = view.findViewById(R.id.brand)
        val picture: ImageView = view.findViewById(R.id.picture)
        val ranking: ImageView = view.findViewById(R.id.ranking)
        val rankingText: TextView = view.findViewById(R.id.rankingText)
        val calorieText: TextView = view.findViewById(R.id.calorieText)
        val bookmark: ImageView = view.findViewById(R.id.bookmark)
        val calorie: ImageView = view.findViewById(R.id.calorie)
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_product, parent, false)


        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.name.text = item.name
        holder.brand.text = item.brand
        holder.calorieText.text =  "500 kCal/part"
        holder.rankingText.text = "Bien"
        holder.picture.setImageResource(R.drawable.food)
        holder.ranking.setImageResource(R.drawable.ic_ranking)
        holder.bookmark.setImageResource(R.drawable.ic_nav_bar_bookmarks)
        holder.calorie.setImageResource(R.drawable.ic_calories)


        holder.itemView.setOnClickListener() {
            val i = Intent(context, ProductActivity::class.java)

            context.startActivity(i)
        }
    }

    override fun getItemCount() = dataset.size


}