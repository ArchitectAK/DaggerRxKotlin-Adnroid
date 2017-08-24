package com.freeankit.dagger2retrofit2rxkotlinrxandroidapplication.network

import com.freeankit.dagger2retrofit2rxkotlinrxandroidapplication.data_model.GithubUser
import io.reactivex.Observable
import retrofit2.http.GET

/**
 * @author Ankit Kumar (ankitdroiddeveloper@gmail.com)
 * @date 24/08/2017.
 */
interface IRetrofit {
    @GET("users/AnkitDroidGit")
    fun getGithubDetails(): Observable<GithubUser>
}