package com.sumigaborna.daggervshilt.di

import com.sumigaborna.daggervshilt.ui.ImagesFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract  fun contributeImagesFragment(): ImagesFragment
}