package com.example.lab8_ph39815.ui.screens

import android.graphics.drawable.shapes.Shape
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AddCircle
import androidx.compose.material3.Button
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.lab8_ph39815.data.Movie
import com.example.lab8_ph39815.ui.components.MovieColumnItem
import com.example.lab8_ph39815.viewmodel.MovieViewModel

@Composable
fun MovieScreen(navController: NavController, movieViewModel: MovieViewModel) {
    val moviesState = movieViewModel.movies.observeAsState(initial = emptyList())
    Log.d("zzzzzzzzzzz", "MovieScreen: ${moviesState.value}")
    val movies = moviesState.value
    Column(modifier = Modifier.fillMaxSize()) {
        MovieColumn(movies, onEditClick = {
            navController.navigate("${Screen.EDIT.route}/${it}")
        }, onDeleteClick = { movieViewModel.deleteMovieById(it) })
        Box(modifier = Modifier.fillMaxWidth().padding(end = 30.dp)) {
            FloatingActionButton(
                onClick = { navController.navigate(Screen.ADD.route) },
                shape = RoundedCornerShape(10.dp), containerColor = Color.LightGray,
                modifier = Modifier.align(Alignment.BottomEnd)
            ) {
                Icon(Icons.Rounded.AddCircle, contentDescription = null)
            }
        }
    }
}

@Composable
fun MovieColumn(
    movies: List<Movie>,
    onEditClick: (id: String) -> Unit,
    onDeleteClick: (id: String) -> Unit
) {
    LazyColumn(
        state = rememberLazyListState(),
        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(movies.size) { index ->
            MovieColumnItem(
                movie = movies[index],
                onEditClick = onEditClick,
                onDeleteClick = onDeleteClick
            )
        }
    }
}