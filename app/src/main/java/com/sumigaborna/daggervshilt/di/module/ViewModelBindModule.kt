package com.sumigaborna.daggervshilt.di.module

import androidx.lifecycle.ViewModelProvider
import com.sumigaborna.daggervshilt.di.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelBindModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}
