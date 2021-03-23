package com.sumigaborna.daggervshilt.di.module

import com.sumigaborna.daggervshilt.di.scope.MainScope
import com.sumigaborna.daggervshilt.ui.MainActivity
import com.sumigaborna.daggervshilt.ui.images.di.ImageFragmentBuilderModule
import com.sumigaborna.daggervshilt.ui.images.di.ImagesBindModule
import com.sumigaborna.daggervshilt.ui.images.di.ImagesModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @MainScope
    @ContributesAndroidInjector(
        modules = [ImageFragmentBuilderModule::class, ImagesBindModule::class ,ImagesModule::class]
    )
    abstract fun contributeMainActivity(): MainActivity
}