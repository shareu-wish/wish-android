package ru.shareu.wish.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ru.shareu.wish.logic.navigation.Routes
import ru.shareu.wish.ui.screens.WebViewScreen
import ru.shareu.wish.ui.screens.WelcomeScreen

@Composable
fun NavigationGraph(
    navController: NavHostController,
    onBottomBarVisibilityChanged: (Boolean) -> Unit
) {
    NavHost(navController, startDestination = Routes.Welcome.route) {
        composable(Routes.Welcome.route) {
            onBottomBarVisibilityChanged(false)
            WelcomeScreen(navController = navController)
        }
        composable(Routes.Home.route) {
            onBottomBarVisibilityChanged(false)
            WebViewScreen("https://shareu.ru/station-map")
        }
    }
}