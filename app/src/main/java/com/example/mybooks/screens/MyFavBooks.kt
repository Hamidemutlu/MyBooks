package com.example.mybooks.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mybooks.models.Books
import com.example.mybooks.models.getBooks
import com.example.mybooks.ui.theme.Shapes

class MyFavBooks {
}
@Preview
@Composable
//fun Booklist(books: MyFavBooks: List<Books> = getBooks()) {
    //LazyColumn {
        fun BookLists(modifier: Modifier = Modifier, books: List<Books> = getBooks()) {
            LazyColumn (
                modifier = modifier,
                contentPadding = PaddingValues(all = 12.dp),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                items(books) {books ->
                    BookRow(books)
                }
            }
        }

@Composable
fun BookRow(books: Books = getBooks()[0]) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(5.dp),
        shape = Shapes.large,
        elevation = 10.dp
    ) {
        Column {
            Box(modifier = Modifier
                .height(150.dp)
                .fillMaxWidth(),
                //contentAlignment = Alignment.Center
            )
        }

        BooksDetails(modifier= Modifier.padding(12.dp), books = books)
    }

}
@Composable
fun BooksDetails(modifier: Modifier = Modifier, books: Books){

}