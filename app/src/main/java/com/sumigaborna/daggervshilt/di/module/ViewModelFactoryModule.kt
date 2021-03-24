package com.sumigaborna.daggervshilt.di.module

import androidx.lifecycle.ViewModelProvider
import com.sumigaborna.daggervshilt.di.ViewModelProviderFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {

    @Binds
    abstract fun bindViewModelFactory(viewModelProviderFactory: ViewModelProviderFactory): ViewModelProvider.Factory
}
