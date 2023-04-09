package com.example.lazycoumnjatpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lazycoumnjatpack.ui.theme.LazyCoumnJatpackTheme
import com.example.lazycoumnjatpack.ui.theme.Teal200

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyRow (horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth().background(Teal200).padding(4.dp)
                ){
                var list = listOf(ItemRowModel(R.drawable.cat1, "cat1"), ItemRowModel(R.drawable.cat2, "cat2"),
                    ItemRowModel(R.drawable.cat3, "cat3"), ItemRowModel(R.drawable.cat1, "WWWcat4"), ItemRowModel(R.drawable.cat3, "catr5"),)
                itemsIndexed(list) {index, itemImg ->
                    ItemRow(item = itemImg)
                }
            }
        }
    }
}

