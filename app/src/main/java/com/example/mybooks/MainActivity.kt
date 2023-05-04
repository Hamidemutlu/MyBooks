package com.example.mybooks

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mybooks.models.Books
import com.example.mybooks.models.getBooks
import com.example.mybooks.screens.BookLists
import com.example.mybooks.ui.theme.MyBooksTheme
import com.example.mybooks.ui.theme.Shapes


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyBooksTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    Scaffold(topBar = {
                        SimpleTopAppBar()
                    }) { padding ->
                        val books = getBooks()
                        BookLists(books = books)
                        BookLists(
                            modifier = Modifier.padding(padding),
                            books = books)
                    }
            }
        }
    }
}
    @Composable
    fun SimpleTopAppBar(){
        var showMenu by remember { mutableStateOf(false) }

        TopAppBar(
            title = { Text("My Favorite Books") },
            actions = {
                IconButton(onClick = { showMenu = !showMenu }) {
                    Icon(imageVector = Icons.Default.MoreVert, contentDescription = "More")
                }
                DropdownMenu(
                    expanded = showMenu,
                    onDismissRequest = { showMenu = false }
                ) {
                    DropdownMenuItem(onClick = { println("Favs clicked") }) {
                        Row {
                            Icon(imageVector = Icons.Default.Favorite, contentDescription = "Favorites", modifier = Modifier.padding(4.dp))
                            Text(text = "Favorites", modifier = Modifier
                                .width(100.dp)
                                .padding(4.dp))
                        }
                    }
                }
            }
        )
    }
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