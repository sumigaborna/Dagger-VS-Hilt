package com.sumigaborna.daggervshilt.ui.images.repo

import com.sumigaborna.daggervshilt.data.ImagesResponse
import com.sumigaborna.daggervshilt.ui.images.ImagesApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ImagesRepositoryImpl @Inject constructor(private val imagesApiService: ImagesApiService) :
    ImagesRepository {

    override suspend fun getImages(): ImagesResponse = withContext(Dispatchers.IO) {
        return@withContext imagesApiService.getImages()
    }
}