package com.example.lab8_ph39815.ui.screens

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.lab8_ph39815.activity.LoginScreen
import com.example.lab8_ph39815.viewmodel.MovieViewModel

@Composable
fun ScreenNavigation() {
    val navController = rememberNavController()
    val movieViewModel: MovieViewModel = viewModel()
    NavHost(
        navController = navController,
        startDestination = Screen.LOGIN.route,
    ) {
        composable(Screen.LOGIN.route) { LoginScreen(navController) }
        composable(Screen.ADD.route) { MovieFormScreen(navController, movieViewModel, null) }
        composable(
            "${Screen.EDIT.route}/{filmId}",
            arguments = listOf(navArgument("filmId") { type = NavType.StringType }),
        ) { backStackEntry ->
            backStackEntry.arguments?.getString("filmId")?.let { filmId ->
                MovieFormScreen(navController, movieViewModel, filmId)
            }
        }

        composable(Screen.MOVIE_SCREEN.route) { MovieScreen(navController, movieViewModel) }
    }
}

