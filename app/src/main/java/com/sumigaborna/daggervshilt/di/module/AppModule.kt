package com.sumigaborna.daggervshilt.di.module

import android.app.Application
import android.content.Context
import com.sumigaborna.daggervshilt.DaggerVSHiltApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideApplication(app: DaggerVSHiltApp): Application = app

    @Provides
    @Singleton
    fun provideAppContext(app: Application): Context {
        return app.applicationContext
    }
}