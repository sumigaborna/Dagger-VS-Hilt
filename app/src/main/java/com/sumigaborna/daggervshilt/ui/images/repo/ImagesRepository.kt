package com.sumigaborna.daggervshilt.ui.images.repo

import com.sumigaborna.daggervshilt.data.ImagesResponse

interface ImagesRepository {

    suspend fun getImages():ImagesResponse
}