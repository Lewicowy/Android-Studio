package ru.startandroid.weatherapp

data class DayItem(
    val city: String,
    val time: String,
    val condition: String,
    val image: String,
    val currentTemp: String,
    val maxTemp: String,
    val minTemp: String,
    val hours: String
)
