package ru.shareu.wish.logic.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavigationItems(
    val route: String,
    val title: String? = null,
    val icon: ImageVector? = null
) {
    data object Home : BottomNavigationItems(
        route = "WebViewScreen",
        title = "Home",
        icon = Icons.Outlined.Home
    )
}