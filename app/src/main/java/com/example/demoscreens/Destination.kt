package com.example.demoscreens

sealed class Destination(val route: String){
    object Screen1 : Destination("Screen1")
    object Screen2 : Destination("Screen2")
    object Screen3 : Destination("Screen3")
    object Conversation: Destination("Conversation")
}
