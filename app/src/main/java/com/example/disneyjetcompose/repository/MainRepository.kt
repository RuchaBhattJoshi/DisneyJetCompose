package com.example.disneyjetcompose.repository

import com.example.disneyjetcompose.network.DisneyApi
import dagger.hilt.android.scopes.ActivityScoped
import timber.log.Timber
import javax.inject.Inject

@ActivityScoped
class MainRepository
    @Inject
    constructor(private val disneyApi: DisneyApi)
    : Repository {

    init {
        Timber.d("Injection MainRepository")
    }

}