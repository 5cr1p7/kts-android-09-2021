package com.ramilkapev.kts_android_09_2021.networking.models


import com.ramilkapev.kts_android_09_2021.networking.models.Ancestry
import com.ramilkapev.kts_android_09_2021.networking.models.CoverPhoto
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Source(
    @Json(name = "ancestry")
    val ancestry: Ancestry?,
    @Json(name = "cover_photo")
    val coverPhoto: CoverPhoto?,
    @Json(name = "description")
    val description: String?,
    @Json(name = "meta_description")
    val metaDescription: String?,
    @Json(name = "meta_title")
    val metaTitle: String?,
    @Json(name = "subtitle")
    val subtitle: String?,
    @Json(name = "title")
    val title: String?
)