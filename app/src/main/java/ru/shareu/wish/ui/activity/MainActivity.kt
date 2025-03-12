package ru.shareu.wish.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import ru.shareu.wish.ui.navigation.AppNavigation
import ru.shareu.wish.ui.theme.WishTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WishTheme {
                AppNavigation()
            }
        }
    }
}

