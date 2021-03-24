package com.sumigaborna.daggervshilt.ui.images.di

import com.sumigaborna.daggervshilt.di.scope.MainScope
import com.sumigaborna.daggervshilt.ui.images.ui.ImagesFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ImageFragmentBuilderModule {

    @ContributesAndroidInjector(
        modules = [ImagesBindModule::class ,ImagesModule::class]
    )
    abstract fun contributeImagesFragment(): ImagesFragment
}