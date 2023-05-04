/*import android.annotation.SuppressLint
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable




@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Preview
@Composable
fun MyFavoriteBooks() {
    val navController = rememberNavController()
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("MyBooks App") },
                navigationIcon = {
                    IconButton(onClick = { navController.navigateUp() }) {
                        Icon(Icons.Filled.ArrowBack, "Back")
                    }
                }
            )
        }
    ) {
        NavHost(navController, startDestination = "myFavoriteBooks") {
            composable("myFavoriteBooks") { MyFavoriteBooksScreen() }
            composable("manageBooks") { ManageBooksScreen() }
        }
    }
}

@Composable
fun MyFavoriteBooksScreen(navController: NavController) {
    Button(onClick = {navController.navigate("manageBooks")}) {
        Text(text = "Manage Books")
    }
}

@Composable
fun ManageBooksScreen(navController: NavController) {
    Button(onClick = {navController.navigateUp()})
    { Text(text = "Back to My favorite Books")}
}

 */