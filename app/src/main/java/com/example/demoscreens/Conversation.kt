package com.example.demoscreens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable
fun Conversation(navController: NavHostController,listOfProfile: List<Profiles>){
    LazyColumn{
        items(listOfProfile) { profile ->
          Screen3(profile = profile, navController = navController)
        }
    }
}

