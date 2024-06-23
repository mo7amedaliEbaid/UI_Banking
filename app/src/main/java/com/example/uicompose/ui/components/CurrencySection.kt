package com.example.uicompose.ui.components

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AttachMoney
import androidx.compose.material.icons.rounded.CurrencyPound
import androidx.compose.material.icons.rounded.CurrencyYen
import androidx.compose.material.icons.rounded.Euro
import androidx.compose.material.icons.rounded.KeyboardArrowUp
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.uicompose.data.Currency

val currencies = listOf<Currency>(
  Currency(
    name = "USD",
    buy = 23.35f,
    sell = 22.35f,
    icon = Icons.Rounded.AttachMoney
  ),
  Currency(
    name = "EUR",
    buy = 23.35f,
    sell = 22.35f,
    icon = Icons.Rounded.Euro
  ),
  Currency(
    name = "EGP",
    buy = 33.35f,
    sell = 15.35f,
    icon = Icons.Rounded.CurrencyPound
  ),
  Currency(
    name = "YEN",
    buy = 23.35f,
    sell = 22.35f,
    icon = Icons.Rounded.CurrencyYen
  ),
)

@Composable
fun CurrencySection() {
  var isVisible by remember {
    mutableStateOf(false)

  }
  var iconState by remember {
    mutableStateOf(Icons.Rounded.KeyboardArrowUp)

  }
  Column(
    modifier = Modifier
      .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
      .background
        (MaterialTheme.colorScheme.inverseOnSurface)
      .animateContentSize()
  ) {
    Row(
      modifier = Modifier
        .padding(16.dp)
        .animateContentSize()
        .fillMaxWidth(),
      verticalAlignment = Alignment.CenterVertically
    ) {
      Box(modifier = Modifier
        .clip(CircleShape)
        .background(MaterialTheme.colorScheme.secondary)
        .clickable {
          isVisible = !isVisible
        }) {

      }
    }
  }
}