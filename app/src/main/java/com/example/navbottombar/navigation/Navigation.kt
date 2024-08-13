package com.example.navbottombar.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.navbottombar.Screens
import com.example.navbottombar.screens.FavScreen
import com.example.navbottombar.screens.HomeScreen
import com.example.navbottombar.screens.ProfileScreen


@Composable
fun Navigation(navController: NavHostController, modifier: Modifier) {
   NavHost(navController = navController,
      startDestination = Screens.Home.route,
      modifier = modifier) {
      composable(Screens.Profile.route){ ProfileScreen()}
      composable(Screens.Favorite.route){ FavScreen()}
      composable(Screens.Home.route){ HomeScreen() }
   }
}