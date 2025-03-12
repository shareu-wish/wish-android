package ru.shareu.wish.logic.navigation

sealed class Routes(val route: String) {
    data object Welcome : Routes("WelcomeScreen")
    data object Home : Routes("WebViewScreen")
}