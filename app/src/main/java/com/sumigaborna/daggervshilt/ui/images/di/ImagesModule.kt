package com.sumigaborna.daggervshilt.ui.images.di

import com.sumigaborna.daggervshilt.di.scope.MainScope
import com.sumigaborna.daggervshilt.ui.images.ImagesApiService
import com.sumigaborna.daggervshilt.ui.images.ImagesRepository
import com.sumigaborna.daggervshilt.ui.images.ImagesRepositoryImpl
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
object ImagesModule {

    @MainScope
    @Provides
    fun providesImagesRepository(imagesRepositoryImpl: ImagesRepositoryImpl):ImagesRepository{
        return imagesRepositoryImpl
    }

    @MainScope
    @Provides
    @JvmSuppressWildcards
    fun provideImagesApiService(retrofit: Retrofit):ImagesApiService{
        return retrofit.create(ImagesApiService::class.java)
    }
}