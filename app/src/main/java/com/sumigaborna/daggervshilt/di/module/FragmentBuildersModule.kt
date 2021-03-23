package com.sumigaborna.daggervshilt.di.module

import com.sumigaborna.daggervshilt.ui.images.ImagesFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract  fun contributeImagesFragment(): ImagesFragment
}