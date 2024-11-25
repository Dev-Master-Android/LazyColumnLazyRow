package com.example.lazycolumnlazyrow.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lazycolumnlazyrow.data.Fruit


@Composable
fun FruitItem(fruit: Fruit) {
    Column(
        modifier = Modifier
            .wrapContentWidth()
            .padding(8.dp)
            .width(100.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = fruit.imageRes),
            contentDescription = fruit.name,
            modifier = Modifier.size(64.dp)
        )
        Text(text = fruit.name, fontSize = 16.sp)
    }
}