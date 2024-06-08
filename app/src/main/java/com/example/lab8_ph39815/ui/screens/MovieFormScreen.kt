package com.example.lab8_ph39815.ui.screens

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavController
import com.example.lab8_ph39815.data.Movie
import com.example.lab8_ph39815.data.MovieRequest
import com.example.lab8_ph39815.data.toMovieFormData
import com.example.lab8_ph39815.data.toMovieRequest
import com.example.lab8_ph39815.ui.components.MovieForm
import com.example.lab8_ph39815.ui.components.MovieFormData
import com.example.lab8_ph39815.ui.components.isAllFieldsEntered
import com.example.lab8_ph39815.ui.components.validateMovieDataAndEnsureCompletion
import com.example.lab8_ph39815.viewmodel.MovieViewModel


@Composable
fun MovieFormScreen(
    navController: NavController,
    movieViewModel: MovieViewModel,
    filmId: String?,
) {
    val movie = movieViewModel.getMovieById(filmId).observeAsState(initial = null).value
    val isEditing = filmId != null
    var formData by remember(movie) { mutableStateOf(movie?.toMovieFormData() ?: MovieFormData()) }
    MovieForm(
        formData = formData,
        onSave = {
            Log.d("zzzzzz", "MovieFormScreen: $filmId")
            if (filmId == null) {
                movieViewModel.addFilm(formData.toMovieRequest())
                navController.popBackStack()
            } else {
                formData.id = filmId
                movieViewModel.updateMovie(formData.toMovieRequest())
                navController.popBackStack()

            }
        },
        navController = navController
    ) { updatedFormData ->
        formData = updatedFormData
        val isValid =
            if (isEditing) movie?.let { validateMovieDataAndEnsureCompletion(updatedFormData, it) }
                ?: false
            else isAllFieldsEntered(updatedFormData)
    }
}






