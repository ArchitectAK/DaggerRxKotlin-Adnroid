package com.freeankit.dagger2retrofit2rxkotlinrxandroidapplication.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.freeankit.dagger2retrofit2rxkotlinrxandroidapplication.AppAnkit
import com.freeankit.dagger2retrofit2rxkotlinrxandroidapplication.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppAnkit.appComponent.inject(this);
        val toolbar = toolbar as android.support.v7.widget.Toolbar
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false);
        toolbar.setBackgroundColor(resources.getColor(R.color.colorAccent));
    }

    fun fibonacci() {
        val febCount = 15
        val feb = IntArray(febCount)
        feb[0] = 0
        feb[1] = 1
        for (i in 2 until febCount) {
            feb[i] = feb[i - 1] + feb[i - 2]
        }

        for (i in 0 until febCount) {
            print(feb[i].toString() + " ")
        }
    }
}
