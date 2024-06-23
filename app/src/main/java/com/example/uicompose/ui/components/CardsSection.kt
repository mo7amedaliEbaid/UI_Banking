package com.example.uicompose.ui.components

import android.graphics.drawable.Drawable
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ahmedapps.bankningappui.ui.theme.BlueEnd
import com.ahmedapps.bankningappui.ui.theme.BlueStart
import com.ahmedapps.bankningappui.ui.theme.GreenEnd
import com.ahmedapps.bankningappui.ui.theme.GreenStart
import com.ahmedapps.bankningappui.ui.theme.OrangeEnd
import com.ahmedapps.bankningappui.ui.theme.OrangeStart
import com.ahmedapps.bankningappui.ui.theme.PurpleEnd
import com.ahmedapps.bankningappui.ui.theme.PurpleStart
import com.example.uicompose.R
import com.example.uicompose.data.Card

val cards = listOf(
  Card(
    cardType = "VISA",
    cardNumber = "1234 5678 9101 1121",
    cardName = "Business",
    balance = 50.5,
    color = getColor(PurpleStart, PurpleEnd)
  ),
  Card(
    cardType = "Master Card",
    cardNumber = "1234 1111 9181 1121",
    cardName = "Savings",
    balance = 80.5,
    color = getColor(BlueStart, BlueEnd)
  ),
  Card(
    cardType = "VISA",
    cardNumber = "0000 5678 9101 0021",
    cardName = "School",
    balance = 58.5,
    color = getColor(OrangeStart, OrangeEnd)
  ),
  Card(
    cardType = "VISA",
    cardNumber = "1234 5678 9101 1121",
    cardName = "Business",
    balance = 65.5,
    color = getColor(GreenStart, GreenEnd)
  )
)

fun getColor(
  startColor: Color,
  endColor: Color,
): Brush {
  return Brush.horizontalGradient(
    colors = listOf(startColor, endColor)
  )
}

@Composable
fun CardsSection() {
  LazyRow {
    items(cards.size) { index ->
      CardItem(index)
    }
  }
}

@Composable
fun CardItem(index: Int) {
  val card: Card = cards[index]
  var lastItemPaddingAtEnd = 0.dp
  if (index == cards.size - 1) {
    lastItemPaddingAtEnd = 16.dp
  }
  var image= painterResource(id = R.drawable.visaPng)
  if (){

  }
}