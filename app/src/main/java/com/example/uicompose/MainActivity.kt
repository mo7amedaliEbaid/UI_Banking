package com.example.uicompose

import com.ahmedapps.bankningappui.ui.theme.BankningAppUITheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ahmedapps.bankningappui.ui.theme.BankningAppUITheme
import com.example.uicompose.ui.components.BottomNavigationBar

//import com.example.uicompose.ui.theme.UIComposeTheme
//import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      BankningAppUITheme {
        // A surface container using the 'background' color from the theme

        // SetBarColor(color = MaterialTheme.colorScheme.background)
        Surface(
          modifier = Modifier.fillMaxSize(),
          color = MaterialTheme.colorScheme.background
        ) {

          HomeScreen()

        }
      }
    }
  }

  /*  @Composable
    private fun SetBarColor(color: Color) {
    //  val systemUiController = rememberSystemUiController()
      SideEffect {
        systemUiController.setSystemBarsColor(
          color = color
        )
      }
    }*/
}

/*
@Preview(showBackground = true, name = "first", widthDp = 200, heightDp = 200)
@Composable
fun GreetingPreview() {
  UIComposeTheme {
    Greeting("Android")
  }
}*/
@Preview
@Composable
fun HomeScreen() {
  Scaffold(
    bottomBar = {
      BottomNavigationBar()
    },
    content = { padding ->
      // Apply the inner padding to your content
      Column(
        Modifier
          .fillMaxSize()
          .padding(padding)
      ) {
        // Your content goes here

      }
    }
  )
}