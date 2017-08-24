package com.freeankit.dagger2retrofit2rxkotlinrxandroidapplication.di.module

import android.app.Application
import android.content.Context
import com.freeankit.dagger2retrofit2rxkotlinrxandroidapplication.AppAnkit

import javax.inject.Singleton
import dagger.Module
import dagger.Provides

/**
 * @author Ankit Kumar (ankitdroiddeveloper@gmail.com)
 * @date 24/08/2017.
 */
@Module
class AppAnkitModule(val appAnkit: AppAnkit) {
    @Provides
    @Singleton
    fun provideContext(): Context = appAnkit

    @Provides
    @Singleton
    fun provideApplication(): Application = appAnkit
}