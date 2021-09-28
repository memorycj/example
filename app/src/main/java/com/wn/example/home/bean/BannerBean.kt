package com.wn.example.home.bean

import com.google.gson.annotations.SerializedName

class BannerBean {
    @SerializedName("data")
    var data: List<BannerData>? = null

    class BannerData{
        @SerializedName("imagePath")
        var imagePath: String? = null

        @SerializedName("title")
        var title: String? = null
    }
}
