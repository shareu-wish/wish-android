package ru.shareu.wish.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.delay
import ru.shareu.wish.R
import ru.shareu.wish.logic.navigation.BottomNavigationItems
import ru.shareu.wish.ui.theme.WishTheme

@Composable
fun WelcomeScreen(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxSize().padding(50.dp),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painterResource(R.drawable.wish),
            "Logo",
            tint = Color.Unspecified)
    }
    LaunchedEffect(Unit){
        delay(1000)
        navController.navigate(BottomNavigationItems.Home.route)
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomePreview() {
    WishTheme {
        WelcomeScreen(rememberNavController())
    }
}