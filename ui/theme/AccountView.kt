package com.example.musicapppinnacle.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.musicapppinnacle.R

@Composable
fun AccountView() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row() {
                Icon(imageVector = Icons.Default.AccountCircle,
                    contentDescription = "Account",
                    tint = MaterialTheme.colorScheme.surfaceTint,
                    modifier = Modifier.padding(end = 6.dp)
                )
                Column {
                    Text(text = "Saransh Golash",
                        fontWeight = FontWeight.Medium,
                        color = MaterialTheme.colorScheme.onBackground)
                    Text("@saranshgolash@gmail.com",
                        fontWeight = FontWeight.Medium,
                        color = MaterialTheme.colorScheme.onBackground)
                }
            }
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.surfaceTint
                )
            }
        }
        Row(modifier = Modifier.padding(end = 8.dp)) {
            Icon(
                painter = painterResource(id = R.drawable.ic_music_player_green),
                contentDescription = "My Music",
                tint = MaterialTheme.colorScheme.surfaceTint,
                modifier = Modifier.padding(end = 8.dp)
            )
            Text(text = "My Music",
                fontWeight = FontWeight.Medium,
                color = MaterialTheme.colorScheme.onBackground)
        }
        Divider()
    }
}