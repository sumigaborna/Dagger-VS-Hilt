package com.sumigaborna.daggervshilt.data

class ImagesResponse : ArrayList<ImagesResponseItem>()

data class ImagesResponseItem(
    val id: Int,
    val albumId: Int,
    val thumbnailUrl: String,
    val title: String,
    val url: String
)