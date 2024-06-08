package com.example.lab8_ph39815.ui.components

import android.app.DatePickerDialog
import androidx.compose.foundation.clickable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

@Composable
fun DatePickerField(
    label: String,
    selectedDate: String,
    onDateSelected: (String) -> Unit,
    modifier: Modifier
) {
    val context = LocalContext.current
    var showDialog by remember { mutableStateOf(false) }
    val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
    if (showDialog) {
        val calendar = Calendar.getInstance()
        try {
            calendar.time = dateFormat.parse(selectedDate) ?: Date()
        } catch (_: Exception) {
        }
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)
        DatePickerDialog(
            context, { _, selectedYear, selectedMonth, dayOfMonth ->
                val newCalendar = Calendar.getInstance().apply {
                    set(selectedYear, selectedMonth, dayOfMonth)
                }
                onDateSelected(dateFormat.format(newCalendar.time))
            }, year, month, day
        ).apply {
            show()
        }
        LaunchedEffect(Unit) {
            showDialog = false
        }
    }
    OutlinedTextField(
        modifier = modifier,
        value = selectedDate,
        onValueChange = { },
        readOnly = true,
        label = { Text(label) },
        trailingIcon = {
            Icon(
                Icons.Default.DateRange,
                contentDescription = "Chọn ngày",
                modifier = Modifier.clickable { showDialog = true },
            )
        }
    )
}

