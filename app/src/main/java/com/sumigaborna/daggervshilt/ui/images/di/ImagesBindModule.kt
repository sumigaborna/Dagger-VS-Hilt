package com.sumigaborna.daggervshilt.ui.images.di

import androidx.lifecycle.ViewModel
import com.sumigaborna.daggervshilt.di.scope.ViewModelKey
import com.sumigaborna.daggervshilt.ui.images.ImagesViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ImagesBindModule {

    @Binds
    @IntoMap
    @ViewModelKey(ImagesViewModel::class)
    abstract fun bindViewModel(viewModel: ImagesViewModel): ViewModel
}