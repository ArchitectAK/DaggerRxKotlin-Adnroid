package com.freeankit.ankitprofile.di.component

import android.app.Activity
import com.freeankit.dagger2retrofit2rxkotlinrxandroidapplication.di.module.AppAnkitModule
import com.freeankit.dagger2retrofit2rxkotlinrxandroidapplication.di.module.NetworkModule
import com.freeankit.dagger2retrofit2rxkotlinrxandroidapplication.ui.MainFragment
import dagger.Component
import javax.inject.Singleton

/**
 * @author Ankit Kumar (ankitdroiddeveloper@gmail.com)
 * @date 24/08/2017.
 */

@Singleton
@Component(modules = arrayOf(AppAnkitModule::class, NetworkModule::class))
interface AppAnkitComponent {
    fun inject(app: Activity)
    fun inject(dataFragment: MainFragment)
}