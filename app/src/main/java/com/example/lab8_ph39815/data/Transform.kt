package com.example.lab8_ph39815.data

import com.example.lab8_ph39815.ui.components.MovieFormData

object Transform {
    fun MovieResponse.toMovie(): Movie {
        return Movie(
            id = this.filmId,
            filmName = this.filmName,
            duration = this.duration,
            releaseDate = this.releaseDate,
            genre = this.genre,
            national = this.national,
            description = this.description,
            image = this.image
        )
    }
}

fun MovieFormData.toMovieRequest(): MovieRequest {
    val durationInt = try {
        this.duration.toInt()
    } catch (e: NumberFormatException) {
        0
    }
    return MovieRequest(
        filmId = this.id,
        filmName = this.filmName,
        duration = durationInt,
        releaseDate = this.releaseDate,
        genre = this.genre,
        national = this.national,
        description = this.description,
        image = this.imageUrl
    )
}

fun Movie?.toMovieFormData() = this?.let {
    MovieFormData(
        this.id,
        this.filmName,
        this.duration,
        this.releaseDate,
        this.genre,
        this.national,
        this.description,
        this.image
    )
}
