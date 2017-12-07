package com.freeankit.dagger2retrofit2rxkotlinrxandroidapplication.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.freeankit.dagger2retrofit2rxkotlinrxandroidapplication.AppAnkit
import com.freeankit.dagger2retrofit2rxkotlinrxandroidapplication.R
import com.freeankit.dagger2retrofit2rxkotlinrxandroidapplication.network.IRetrofit
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_main.*
import javax.inject.Inject

/**
 * @author Ankit Kumar (ankitdroiddeveloper@gmail.com)
 * @date 24/08/2017.
 */
class MainFragment : Fragment() {
    @Inject
    lateinit var api: IRetrofit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppAnkit.appComponent.inject(this)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater!!.inflate(R.layout.fragment_main, container, false)
//        view.findViewById<TextView>(R.id.name)?.setOnClickListener({
//            startActivity(Intent(context, LoginActivity::class.java))
//        })
        requestUser()
        return view
    }

    @SuppressLint("SetTextI18n")
    private fun requestUser() {
        api.getGithubDetails()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { abc ->
                            run {
                                name.text = abc.name
                                bio.text = abc.bio
                                followers.text = abc.public_repos + " Repositories"
                                Glide.with(context).load(abc.avatar_url)
                                        .apply(RequestOptions().centerCrop()
                                                .placeholder(R.drawable.ic_launcher_background)
                                                .error(R.drawable.ic_launcher_background))
                                        .into(avatar)
                            }

                        },
                        { e ->
                            run {
                                Log.d("Tag", e.message)
                            }
                        }
                )
    }
}