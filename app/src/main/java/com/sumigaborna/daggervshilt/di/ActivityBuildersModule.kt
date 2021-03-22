package com.sumigaborna.daggervshilt.di

import com.sumigaborna.daggervshilt.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @MainScope
    @ContributesAndroidInjector(modules = [])
    abstract fun contributeMainActivity(): MainActivity
}