package com.rizky.submision

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ClothesAdapter(val listClothes: ArrayList<Clothes>) : RecyclerView.Adapter<ClothesAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.list_clothes, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val clth = listClothes [position]
        Glide.with(holder.itemView.context)
            .load(clth.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = clth.name
        holder.tvDetail.text = clth.detail
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listClothes[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listClothes.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_clothes_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_clothes_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.clothes_photo)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Clothes)
    }
}
