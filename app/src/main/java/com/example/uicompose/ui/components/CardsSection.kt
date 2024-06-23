package com.example.uicompose.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
  var image = painterResource(id = R.drawable.visa)
  if (card.cardType == "Master Card") {
    image = painterResource(id = R.drawable.mastercard)
  }
  Box(
    modifier = Modifier.padding(start = 16.dp, end = lastItemPaddingAtEnd)
  ) {
    Column(
      modifier = Modifier
        .clip(RoundedCornerShape(25.dp))
        .background(card.color)
        .width(250.dp)
        .height(
          160
            .dp
        )
        .clickable { }
        .padding(vertical = 12.dp, horizontal = 16.dp),
      verticalArrangement = Arrangement.SpaceBetween,
    ) {
      Image(painter = image, contentDescription = card.cardName, modifier = Modifier.width(60.dp))
      Spacer(modifier = Modifier.height(10.dp))
      Text(text = card.cardName, color = Color.White, fontSize = 17.sp, fontWeight = FontWeight.Bold)
      Text(text = "$ ${card.balance}", color = Color.White, fontSize = 22.sp, fontWeight = FontWeight.Bold)
      Text(text = card.cardNumber, color = Color.White, fontSize = 18.sp, fontWeight = FontWeight.Bold)

    }
  }
}