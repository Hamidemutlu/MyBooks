package com.example.mybooks.models

data class Books(
        val title: String = "",
        val author: String = "",
        val yearofpublish: String = "",
        val isbn: String = "",
    ) {
}
fun getBooks(): List<Books> {
    return listOf(
        Books(
            title = "Herr der Ringe - Die zwei Türme",
            author = "J. R. R. Tolkien",
            yearofpublish = "2012",
            isbn = "978-3-608-93982-8"
        ),

        Books(
            title = "Harry Poter",
            author = "J. K. Rowling",
            yearofpublish = "2005",
            isbn = "978-3-551-35401-3",
        ),

        Books(
            title = "Augensammler",
            author = "Sebastian Fitzek",
            yearofpublish = "2009",
            isbn = "978-3-426-50375-1"
        ),

        Books(
            title = "Die Leiden des jungen Werthers",
            author = "Johann Wolfgang von Goethe",
            yearofpublish = "1774",
            isbn = "978-3-15-000067-0",
        ),

        Books(
            title = "Offline",
            author = "Arno Strobel",
            yearofpublish = "2019",
            isbn = "978-3-596-70394-4",
        )
    )
}