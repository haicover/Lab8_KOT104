package com.example.lab8_ph39815.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.lab8_ph39815.data.Movie
import com.example.lab8_ph39815.data.MovieRequest


@Composable
fun MovieForm(
    navController: NavController,
    formData: MovieFormData,
    onSave: () -> Unit,
    onUpdateFormData: (MovieFormData) -> Unit,
) {
    Column(
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .verticalScroll(rememberScrollState())
            .imePadding()
    ) {
        Spacer(modifier = Modifier.height(12.dp))
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = formData.filmName,
            onValueChange = { onUpdateFormData(formData.copy(filmName = it)) },
            label = { Text("Tên Phim *") },
            maxLines = 3,
        )
        Spacer(modifier = Modifier.height(12.dp))
        Row(modifier = Modifier.fillMaxWidth()) {
            OutlinedTextField(
                value = formData.duration,
                onValueChange = { onUpdateFormData(formData.copy(duration = it)) },
                label = { Text("Thời Lượng *") },
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                singleLine = true,
                modifier = Modifier.weight(2f)
            )
            Spacer(modifier = Modifier.width(8.dp))
            DatePickerField(
                label = "Ngày Chiếu *",
                selectedDate = formData.releaseDate,
                onDateSelected = { newDate ->
                    onUpdateFormData(formData.copy(releaseDate = newDate))
                },
                modifier = Modifier.weight(3f)
            )
        }
        Spacer(modifier = Modifier.height(12.dp))
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = formData.genre,
            onValueChange = { onUpdateFormData(formData.copy(genre = it)) },
            label = { Text("Thể Loại *") },
            singleLine = true
        )
        Spacer(modifier = Modifier.height(12.dp))
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = formData.national,
            onValueChange = { onUpdateFormData(formData.copy(national = it)) },
            label = { Text("Quốc Gia *") },
            singleLine = true
        )
        Spacer(modifier = Modifier.height(12.dp))
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = formData.imageUrl,
            onValueChange = { onUpdateFormData(formData.copy(imageUrl = it)) },
            label = { Text("Liên kết ảnh minh hoạ *") },
            singleLine = true
        )
        Spacer(modifier = Modifier.height(12.dp))
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .defaultMinSize(minHeight = 200.dp),
            value = formData.description,
            onValueChange = { onUpdateFormData(formData.copy(description = it)) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            label = { Text("Mô Tả *") }
        )
        Spacer(modifier = Modifier.height(12.dp))
        Button(onClick = {
            if (isAllFieldsEntered(formData)) {
                onSave()
            }
        }) {
            Text(text = "Save")
        }
        Button(onClick = {
            navController.popBackStack()
        }) {
            Text(text = "Cancel")
        }
    }
}

fun isAllFieldsEntered(formData: MovieFormData): Boolean {
    return with(formData) {
        filmName.isNotEmpty() && duration.isNotEmpty() && releaseDate.isNotEmpty() &&
                genre.isNotEmpty() && national.isNotEmpty() && description.isNotEmpty() && imageUrl.isNotEmpty()
    }
}

fun validateMovieDataAndEnsureCompletion(formData: MovieFormData, movie: Movie): Boolean {
    if (!isAllFieldsEntered(formData)) return false
    if (formData.filmName != movie.filmName) return true
    if (formData.duration != movie.duration) return true
    if (formData.releaseDate != movie.releaseDate) return true
    if (formData.genre != movie.genre) return true
    if (formData.national != movie.national) return true
    if (formData.description != movie.description) return true
    if (formData.imageUrl != movie.image) return true
    return false
}


data class MovieFormData(
    var id: String? = "",
    var filmName: String = "",
    var duration: String = "",
    var releaseDate: String = "",
    var genre: String = "",
    var national: String = "",
    var description: String = "",
    var imageUrl: String = ""
) {
    fun toMovieRequest(): MovieRequest {
        val filmIdInt = try {
            this.id?.toIntOrNull()
        } catch (e: NumberFormatException) {
            null
        }
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
}
