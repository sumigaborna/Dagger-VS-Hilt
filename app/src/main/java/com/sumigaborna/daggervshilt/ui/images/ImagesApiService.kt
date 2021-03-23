package com.sumigaborna.daggervshilt.ui.images

import androidx.lifecycle.LiveData
import com.sumigaborna.daggervshilt.data.ImagesResponse
import com.sumigaborna.daggervshilt.data.base.ApiResponse
import com.sumigaborna.daggervshilt.data.base.Resource
import retrofit2.http.GET

interface ImagesApiService {

    @GET("photos")
    fun getImages():LiveData<Resource<ApiResponse<ImagesResponse>>>
}