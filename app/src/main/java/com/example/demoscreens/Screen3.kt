package com.example.demoscreens

import android.graphics.drawable.shapes.Shape
import android.media.Image
import android.media.ImageReader
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController

data class Profiles(val name: String, val email: String)

@Composable
fun Screen3(navController: NavHostController ,profile: Profiles, modifier: Modifier = Modifier) {
    Column() {
        Row(modifier = Modifier.padding(all = 8.dp),
        verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.piyus),
                contentDescription = "profile image",
                modifier = modifier
                    .padding(10.dp)
                    .clip(CircleShape)
                    .size(40.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))

            Column(modifier = Modifier.background(color = Color.Blue).fillMaxWidth(0.5f).height(40.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally)
            {

                Text(
                    text = profile.name,

                    )
                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = profile.email
                )
            }
        }
    }
}
