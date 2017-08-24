package com.freeankit.dagger2retrofit2rxkotlinrxandroidapplication.di.module

import com.freeankit.dagger2retrofit2rxkotlinrxandroidapplication.network.IRetrofit
import com.freeankit.dagger2retrofit2rxkotlinrxandroidapplication.utils.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * @author Ankit Kumar (ankitdroiddeveloper@gmail.com)
 * @date 24/08/2017.
 */

@Module
class NetworkModule {
    @Provides
    @Singleton
    fun getRetrofit(): IRetrofit {
        return Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(IRetrofit::class.java)

    }
}