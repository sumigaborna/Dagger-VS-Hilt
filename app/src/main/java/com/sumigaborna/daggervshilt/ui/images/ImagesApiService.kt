package com.sumigaborna.daggervshilt.ui.images

import com.sumigaborna.daggervshilt.data.ImagesResponse
import retrofit2.http.GET

interface ImagesApiService {

    @GET("/photos")
    suspend fun getImages(): ImagesResponse
}