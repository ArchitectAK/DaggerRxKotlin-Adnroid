package com.freeankit.dagger2retrofit2rxkotlinrxandroidapplication.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
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
import com.freeankit.dagger2retrofit2rxkotlinrxandroidapplication.utils.Constants
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
        return inflater!!.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requestUser()
    }

    @SuppressLint("SetTextI18n")
    private fun requestUser() {
        api.getGithubDetails()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { abc ->
                            run {
                                progress.visibility = View.GONE
                                name.text = abc.name
                                bio.text = abc.bio
                                followers.text = abc.followers + " Followers"
                                repos.text = abc.public_repos + " Repositories"
                                following.text = abc.following + " Following"
                                stars.text = abc.location
                                open.setOnClickListener {
                                    val i = Intent(Intent.ACTION_VIEW)
                                    i.data = Uri.parse(abc.html_url)
                                    context.startActivity(i)
                                }
                                app.setOnClickListener {
                                    val i = Intent(Intent.ACTION_VIEW)
                                    i.data = Uri.parse(Constants.APP_URL)
                                    context.startActivity(i)
                                }
                                blog.setOnClickListener {
                                    val i = Intent(Intent.ACTION_VIEW)
                                    i.data = Uri.parse(abc.blog)
                                    context.startActivity(i)
                                }
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