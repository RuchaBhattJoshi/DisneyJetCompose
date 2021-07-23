package com.example.disneyjetcompose.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.annotation.VisibleForTesting
import androidx.compose.runtime.CompositionLocalProvider
import com.example.disneyjetcompose.ui.root.RootViewModel
import com.example.disneyjetcompose.ui.theme.DisneyComposeTheme
import com.skydoves.landscapist.coil.LocalCoilImageLoader
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @VisibleForTesting val viewModel: RootViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            CompositionLocalProvider(LocalCoilImageLoader provides viewModel.imageLoader) {
                DisneyComposeTheme() {
                    DisneyMain()
                }
            }

        }


    }
}