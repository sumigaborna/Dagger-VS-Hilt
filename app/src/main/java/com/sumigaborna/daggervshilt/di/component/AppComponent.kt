package com.sumigaborna.daggervshilt.di.component

import android.app.Application
import com.sumigaborna.daggervshilt.DaggerVSHiltApp
import com.sumigaborna.daggervshilt.di.module.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@JvmSuppressWildcards
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityBuildersModule::class,
        AppModule::class,
        NetworkModule::class,
        ViewModelBindModule::class
    ]
)
interface AppComponent : AndroidInjector<DaggerVSHiltApp> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}