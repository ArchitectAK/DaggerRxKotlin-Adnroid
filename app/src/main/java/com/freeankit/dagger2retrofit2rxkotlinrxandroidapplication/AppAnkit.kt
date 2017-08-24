package com.freeankit.dagger2retrofit2rxkotlinrxandroidapplication

import android.app.Application
import com.freeankit.ankitprofile.di.component.AppAnkitComponent
import com.freeankit.ankitprofile.di.component.DaggerAppAnkitComponent
import com.freeankit.dagger2retrofit2rxkotlinrxandroidapplication.di.module.AppAnkitModule
import com.freeankit.dagger2retrofit2rxkotlinrxandroidapplication.di.module.NetworkModule

/**
 * @author Ankit Kumar (ankitdroiddeveloper@gmail.com)
 * @date 24/08/2017.
 */
class AppAnkit : Application() {
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppAnkitComponent.builder()
                .networkModule(NetworkModule())
                .appAnkitModule(AppAnkitModule(this))
                .build()
    }

    companion object {
        lateinit var appComponent: AppAnkitComponent
    }
}