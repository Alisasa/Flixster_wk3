package com.example.flixster_wk3

import com.google.gson.annotations.SerializedName

class Movie {

    @JvmField
    @SerializedName("original_title")  //original_title is from Json file
    var title: String? = null

    @SerializedName("overview")
    var overview: String? = null

    @SerializedName("poster_path")
    var movieImageUrl: String? = null
}