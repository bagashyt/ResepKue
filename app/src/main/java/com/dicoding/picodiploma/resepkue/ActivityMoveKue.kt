@file:Suppress("RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")

package com.dicoding.picodiploma.resepkue

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ActivityMoveKue : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_kue)




        val tvSetName: TextView = findViewById(R.id.tv_item_name)
        val imageSetPhoto: ImageView = findViewById(R.id.img_item_photo)
        val tvSetDetail: TextView = findViewById(R.id.tv_item_detail)
        val tvItemBahan: TextView = findViewById(R.id.tv_item_bahan)
        val tvItemCara: TextView = findViewById(R.id.tv_item_cara)

        val tName = intent.getStringExtra(EXTRA_NAME)
        val tImageView: Int? = intent.getIntExtra(EXTRA_PHOTO, 0)
        val tDetail = intent.getStringExtra(EXTRA_DETAIL)
        val tbahan = intent.getStringExtra(EXTRA_BAHAN)
        val tcara = intent.getStringExtra(EXTRA_CARA)



        tvSetName.text = tName
        Glide.with(this )
            .load(tImageView)
            .apply(RequestOptions().override(350, 550))
            .into(imageSetPhoto)
        tvSetDetail.text = tDetail
        tvItemBahan.text = tbahan
        tvItemCara.text = tcara
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_BAHAN = "extra_bahan"
        const val EXTRA_CARA = "extra_cara"
    }


}



