package com.freeankit.dagger2retrofit2rxkotlinrxandroidapplication.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.freeankit.dagger2retrofit2rxkotlinrxandroidapplication.AppAnkit
import com.freeankit.dagger2retrofit2rxkotlinrxandroidapplication.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("CommitTransaction")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppAnkit.appComponent.inject(this)
        val toolbar = toolbar as android.support.v7.widget.Toolbar
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        toolbar.setBackgroundColor(resources.getColor(R.color.colorAccent))
    }
}
