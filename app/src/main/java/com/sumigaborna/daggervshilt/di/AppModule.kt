package com.sumigaborna.daggervshilt.di

import android.app.Application
import android.content.Context
import com.sumigaborna.daggervshilt.DaggerVSHiltApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object AppModule {

    @Provides
    @Singleton
    fun provideApplication(app: DaggerVSHiltApp): Application = app

    @Provides
    @Singleton
    fun provideAppContext(app: Application): Context {
        return app.applicationContext
    }
}