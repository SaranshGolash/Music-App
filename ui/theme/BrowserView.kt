package com.example.musicapppinnacle.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.musicapppinnacle.R

@Composable
fun Browse() {
    val categories = listOf("Hits", "Happy", "Jazz", "TGIF", "Pop", "Indie")
    Column(modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colorScheme.background)) {
        LazyVerticalGrid(GridCells.Fixed(2)) {
            items(categories) { cat ->
                BrowserItem(cat = cat, drawable = R.drawable.baseline_apps_24)
            }
        }
    }
}