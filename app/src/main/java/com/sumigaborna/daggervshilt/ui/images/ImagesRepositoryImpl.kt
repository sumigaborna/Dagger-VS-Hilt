package com.sumigaborna.daggervshilt.ui.images

import androidx.lifecycle.LiveData
import com.sumigaborna.daggervshilt.data.ImagesResponse
import com.sumigaborna.daggervshilt.data.base.ApiResponse
import com.sumigaborna.daggervshilt.data.base.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ImagesRepositoryImpl @Inject constructor(private val imagesApiService : ImagesApiService) : ImagesRepository{

    override suspend fun getImages(): LiveData<Resource<ApiResponse<ImagesResponse>>> {
        return withContext(Dispatchers.IO){
            imagesApiService.getImages()
        }
    }
}