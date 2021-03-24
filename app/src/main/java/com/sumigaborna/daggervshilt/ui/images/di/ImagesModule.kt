package com.sumigaborna.daggervshilt.ui.images.di

import com.sumigaborna.daggervshilt.ui.images.ImagesApiService
import com.sumigaborna.daggervshilt.ui.images.repo.ImagesRepository
import com.sumigaborna.daggervshilt.ui.images.repo.ImagesRepositoryImpl
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
object ImagesModule {

    @Provides
    fun providesImagesRepository(imagesRepositoryImpl: ImagesRepositoryImpl): ImagesRepository {
        return imagesRepositoryImpl
    }

    @Provides
    @JvmSuppressWildcards
    fun provideImagesApiService(retrofit: Retrofit): ImagesApiService {
        return retrofit.create(ImagesApiService::class.java)
    }
}