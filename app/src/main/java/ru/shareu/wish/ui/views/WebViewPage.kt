package ru.shareu.wish.ui.views

import android.annotation.SuppressLint
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import ru.shareu.wish.ui.theme.WishTheme


@SuppressLint("SetJavaScriptEnabled")
@Composable
fun WebViewPage(url: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current

    val webView = remember {
        WebView(context).apply {
            settings.builtInZoomControls = true
            settings.javaScriptEnabled = true
            settings.domStorageEnabled = true
            settings.setGeolocationEnabled(true)
            settings.cacheMode = WebSettings.LOAD_DEFAULT
            webViewClient = WebViewClient()
        }
    }

    AndroidView(
        modifier = modifier.fillMaxSize(),
        factory = { webView },
        update = {
            it.loadUrl(url)
        })
}

@Preview(showBackground = true)
@Composable
fun WebViewPagePreview() {
    WishTheme {
        WebViewPage("https://developer.android.com/studio")
    }
}