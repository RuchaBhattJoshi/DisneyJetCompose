package com.example.disneyjetcompose.ui.root

import androidx.lifecycle.ViewModel
import coil.ImageLoader
import dagger.hilt.android.lifecycle.HiltViewModel
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class RootViewModel @Inject constructor(
  val imageLoader: ImageLoader
) : ViewModel() {
  init {
    Timber.d("init RootViewModel")
  }
}
