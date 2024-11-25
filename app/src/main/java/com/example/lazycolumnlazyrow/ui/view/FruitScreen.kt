package com.example.lazycolumnlazyrow.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lazycolumnlazyrow.R
import com.example.lazycolumnlazyrow.data.Fruit
import com.example.lazycolumnlazyrow.ui.theme.LazyColumnLazyRowTheme

@Composable
fun FruitScreen() {
    val fruits = listOf(
        Fruit("Apple", R.drawable.apple),
        Fruit("Banana", R.drawable.banana),
        Fruit("Cherry", R.drawable.cherry),
        Fruit("Grape", R.drawable.grape),
        Fruit("Orange", R.drawable.orange),
        Fruit("Apple", R.drawable.apple),
        Fruit("Banana", R.drawable.banana),
        Fruit("Cherry", R.drawable.cherry),
        Fruit("Grape", R.drawable.grape),
        Fruit("Orange", R.drawable.orange),
        Fruit("Apple", R.drawable.apple),
        Fruit("Banana", R.drawable.banana),
        Fruit("Cherry", R.drawable.cherry),
        Fruit("Grape", R.drawable.grape),
        Fruit("Orange", R.drawable.orange)
    )
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Фрукты в ряд",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp)
        )

        LazyRow {
            items(fruits) { fruit ->
                FruitItem(fruit)
            }
        }

        Text(
            text = "Фрукты в колонке",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp)
        )

        LazyColumn {
            items(fruits) { fruit ->
                FruitItem(fruit)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LazyColumnLazyRowTheme {
        FruitScreen()
    }
}