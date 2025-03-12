package ru.shareu.wish.ui.navigation

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import ru.shareu.wish.logic.navigation.BottomNavigationItems
import ru.shareu.wish.ui.theme.Background

@Composable
fun BottomBar(
    navController: NavHostController,
    state: Boolean,
    modifier: Modifier = Modifier
) {
    val screens = listOf(
        BottomNavigationItems.Home,
    )

    NavigationBar(
        modifier = modifier,
        containerColor = Background,
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        screens.forEach { screen ->
            NavigationBarItem(
                icon = {
                    Icon(imageVector = screen.icon!!, contentDescription = "")
                },
                selected = currentRoute == screen.route,
                onClick = {
                    navController.navigate(screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                colors = NavigationBarItemDefaults.colors(
                    unselectedTextColor = Color.Gray,
                    selectedTextColor = Color.Black,
                    selectedIconColor = Color.Black,
                    unselectedIconColor = Color.Black,
                    indicatorColor = Background
                ),
            )
        }
    }
}