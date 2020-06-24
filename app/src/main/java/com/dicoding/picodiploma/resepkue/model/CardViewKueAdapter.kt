package com.dicoding.picodiploma.resepkue.model


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.picodiploma.resepkue.ActivityMoveKue
import com.dicoding.picodiploma.resepkue.R


class CardViewKueAdapter(private val listKue: ArrayList<Kue>) : RecyclerView.Adapter<CardViewKueAdapter.CardViewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_kue, parent, false)
        return CardViewViewHolder(view)
    }

    override fun getItemCount(): Int{
        return listKue.size
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {

        val kue = listKue[position]
        Glide.with(holder.itemView.context)
            .load(kue.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
        holder.tvName.text = kue.name
        holder.tvDetail.text = kue.detail



        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener{
            val moveDetail = Intent(mContext, ActivityMoveKue::class.java)
            moveDetail.putExtra(ActivityMoveKue.EXTRA_NAME, kue.name)
            moveDetail.putExtra(ActivityMoveKue.EXTRA_PHOTO, kue.photo)
            moveDetail.putExtra(ActivityMoveKue.EXTRA_DETAIL, kue.detail)
            moveDetail.putExtra(ActivityMoveKue.EXTRA_BAHAN, kue.bahan)
            moveDetail.putExtra(ActivityMoveKue.EXTRA_CARA, kue.cara)
            mContext.startActivity(moveDetail)

            holder.btnFavorite.setOnClickListener {
                Toast.makeText(holder.itemView.context, "Favorite " + listKue[position].name, Toast.LENGTH_SHORT).show()
            }
            holder.btnShare.setOnClickListener {
                Toast.makeText(holder.itemView.context, "Share" + listKue[position].name, Toast.LENGTH_SHORT).show()
            }
        }

    }



    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var btnFavorite: Button = itemView.findViewById(R.id.btn_set_favorite)
        var btnShare: Button = itemView.findViewById(R.id.btn_set_share)
    }

}
