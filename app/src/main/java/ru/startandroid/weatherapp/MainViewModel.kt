package ru.startandroid.weatherapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.startandroid.weatherapp.adapters.WeatherModel

// Главный экран приложения погоды

class MainViewModel: ViewModel() {
    val liveDataCurrent = MutableLiveData<WeatherModel>() // Хранит данные о текущей погоде
    val liveDataList = MutableLiveData<List<WeatherModel>>() // Хранит список прогнозов
}