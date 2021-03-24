package com.sumigaborna.daggervshilt.data

class ImagesResponse : ArrayList<ImagesResponseItem>()

data class ImagesResponseItem(
    val albumId: Int,
    val id: Int,
    val thumbnailUrl: String,
    val title: String,
    val url: String
)