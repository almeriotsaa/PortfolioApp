package com.almerio.portfolios.binding_adapter

import android.widget.ImageView
import android.widget.TextView
import coil.load
import androidx.databinding.BindingAdapter
import com.almerio.portfolios.data.Portofolio

@BindingAdapter("androidTitle")
fun TextView.setTitleAndroid(data: Portofolio?){
    data?.let {
        text = data.title
    }
}

@BindingAdapter("androidImage")
fun ImageView.setAndroidImage(data: Portofolio){
    load(data.img){
        crossfade(1000)
    }
}