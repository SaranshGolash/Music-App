package com.example.musicapppinnacle.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun SubscriptionView() {
    Column(modifier = Modifier.fillMaxSize().
    background(MaterialTheme.colorScheme.background)) {
        Column(
            modifier = Modifier.height(200.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Manage Subscription",
            fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.onBackground)
            Card(modifier = Modifier.padding(8.dp),
                backgroundColor = MaterialTheme.colorScheme.background,
                elevation = 4.dp) {
                Column(modifier = Modifier.padding(8.dp)) {
                    Column() {
                        Text(text = "Musical", color = MaterialTheme.colorScheme.onBackground)
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text("Free Tier", color = MaterialTheme.colorScheme.onBackground)
                            TextButton(onClick = {}) {
                                Row {
                                    Text(text = "See all Plans",
                                        color = MaterialTheme.colorScheme.onBackground)
                                    Icon(
                                        imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                                        tint = MaterialTheme.colorScheme.onBackground,
                                        contentDescription = "See all Plans"
                                    )
                                }
                            }
                        }
                    }
                    Divider(thickness = 3.dp, modifier = Modifier.padding(horizontal = 8.dp,))
                    Row(Modifier.padding(vertical = 16.dp)) {
                        Icon(
                            imageVector = Icons.Default.AccountBox,
                            tint = MaterialTheme.colorScheme.onBackground,
                            modifier = Modifier.padding(end = 8.dp),
                            contentDescription = "Get a Plan"
                        )
                        Text(text = "Get a Plan", color = MaterialTheme.colorScheme.onBackground)
                    }
                }
                Divider(thickness = 5.dp, modifier = Modifier.padding(horizontal = 8.dp))
            }
        }
    }
}