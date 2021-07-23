package com.example.disneyjetcompose.ui.main

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.insets.ProvideWindowInsets

@Composable
fun DisneyMain() {
    val navController = rememberNavController()
    val context = LocalContext.current

    ProvideWindowInsets {
        
        NavHost(navController = navController, startDestination = NavScreen.Home.route) {

            composable(NavScreen.Home.route)
            {

            }

            composable(NavScreen.PosterDetails.route)
            {

            }

        }
        
    }


}

sealed class NavScreen(val route: String) {

    object Home : NavScreen("Home")
    object PosterDetails : NavScreen("PosterDetails") {

        const val routeWithArgument: String = "PosterDetails/{posterId}"
        const val argument0: String = "posterId"
    }
}