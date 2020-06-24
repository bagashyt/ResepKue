package com.dicoding.picodiploma.resepkue.model

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.picodiploma.resepkue.ActivityMoveKue
import com.dicoding.picodiploma.resepkue.R

class GridKueAdapter(val listKue: ArrayList<Kue>) : RecyclerView.Adapter<GridKueAdapter.GridViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): GridViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_grid_kue, viewGroup, false)
        return GridViewHolder(view)

    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        val kue = listKue[position]
        val (name, detail, photo, bahan, cara) = listKue[position]
        val mContext = holder.itemView.context

        Glide.with(holder.itemView.context)
            .load(listKue[position].photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
        holder.itemView.setOnClickListener{
            val moveDetail = Intent(mContext, ActivityMoveKue::class.java)
            moveDetail.putExtra(ActivityMoveKue.EXTRA_NAME, name)
            moveDetail.putExtra(ActivityMoveKue.EXTRA_PHOTO, photo)
            moveDetail.putExtra(ActivityMoveKue.EXTRA_DETAIL, detail)
            moveDetail.putExtra(ActivityMoveKue.EXTRA_BAHAN, bahan)
            moveDetail.putExtra(ActivityMoveKue.EXTRA_CARA, cara)
            mContext.startActivity(moveDetail)
        }
    }

    override fun getItemCount(): Int {
        return listKue.size
    }

    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}