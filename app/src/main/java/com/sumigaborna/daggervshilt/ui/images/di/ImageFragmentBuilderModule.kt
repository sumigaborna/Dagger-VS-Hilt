package com.sumigaborna.daggervshilt.ui.images.di

import com.sumigaborna.daggervshilt.ui.images.ImagesFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ImageFragmentBuilderModule {

    @ContributesAndroidInjector(
        modules = [ImagesBindModule::class ,ImagesModule::class]
    )
    abstract fun contributeImagesFragment(): ImagesFragment
}