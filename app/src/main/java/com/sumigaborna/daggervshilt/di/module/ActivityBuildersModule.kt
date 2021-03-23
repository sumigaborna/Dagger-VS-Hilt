package com.sumigaborna.daggervshilt.di.module

import com.sumigaborna.daggervshilt.di.scope.MainScope
import com.sumigaborna.daggervshilt.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @MainScope
    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    abstract fun contributeMainActivity(): MainActivity
}