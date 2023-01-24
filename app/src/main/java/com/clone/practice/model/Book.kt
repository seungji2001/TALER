package com.clone.practice.model

import com.google.gson.annotations.SerializedName

data class Book(
    @SerializedName("itemId") val id: Long = 0,
    @SerializedName("title") val title: String = "",
    @SerializedName("description") val description: String = "",
    @SerializedName("coverSmallUrl") val coverSmallUrl: String = "",
    @SerializedName("coverLargeUrl") val coverLargeUrl: String = "",
    var checked:Boolean = false
)
