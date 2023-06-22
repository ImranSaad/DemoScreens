package com.example.demoscreens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable

@Composable
fun Conversation(listOfProfile: List<Profiles>){
    LazyColumn{
        items(listOfProfile) { profile ->
          Screen3(profile = profile)
        }
    }
}

