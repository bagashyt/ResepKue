package com.dicoding.picodiploma.resepkue.model

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.picodiploma.resepkue.ActivityMoveKue
import com.dicoding.picodiploma.resepkue.R

class ListKueAdapter(val listKue: ArrayList<Kue>) : RecyclerView.Adapter<ListKueAdapter.ListViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_kue, viewGroup, false)
        return ListViewHolder(view)
    }
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val kue = listKue[position]
        val (name, detail, photo, bahan, cara) = listKue[position]
        val mContext = holder.itemView.context

        Glide.with(holder.itemView.context)
            .load(kue.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text = kue.name
        holder.tvDetail.text = kue.detail
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


    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    interface onItemClickCallback {
        fun onItemClicked(data: Kue)
    }
}