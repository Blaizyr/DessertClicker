package com.example.dessertclicker.ui.theme

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.dessertclicker.data.Datasource.dessertList
import com.example.dessertclicker.model.Dessert

data class DessertUiState(
    var dessertsSold: Int = 0,
    var revenue: Int = 0,
    val currentDessertIndex: Int = 0,
    var currentDessertPrice: Int = dessertList[currentDessertIndex].price,
    @DrawableRes var currentDessertImageId: Int = dessertList[currentDessertIndex].imageId,
)