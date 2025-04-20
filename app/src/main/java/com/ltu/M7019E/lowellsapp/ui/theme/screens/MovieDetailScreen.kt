package com.ltu.M7019E.lowellsapp.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.clickable
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.TextStyle
import coil3.compose.AsyncImage
import com.ltu.M7019E.lowellsapp.model.Movie
import com.ltu.M7019E.lowellsapp.utils.Constants


@Composable
fun MovieDetailScreen(
    movie: Movie,
    modifier: Modifier = Modifier,
    onNavigateToThirdScreen: () -> Unit = {}
) {
    Column {
        Box {
            AsyncImage(
                model = Constants.BACKDROP_IMAGE_BASE_URL + Constants.BACKDROP_IMAGE_WIDTH + movie.backdropPath,
                contentDescription = movie.title,
                modifier = modifier
                    .width(92.dp)
                    .height(138.dp),
                contentScale = ContentScale.Crop
            )
        }
        Text(
            text = movie.title,
            style = MaterialTheme.typography.headlineSmall
        )
        Spacer(modifier = Modifier.size(8.dp))
        Text(
            text = movie.releaseDate,
            style = MaterialTheme.typography.bodySmall
        )
        Spacer(modifier = Modifier.size(8.dp))
        Text(
            text = movie.genres.joinToString(", ") { it.name },
            style = MaterialTheme.typography.bodySmall
        )
        Spacer(modifier = Modifier.size(8.dp))
        HyperlinkText(
            url = movie.homepage,
            displayText = "Visit Official Homepage",
        )
        Spacer(modifier = Modifier.size(8.dp))
        HyperlinkText(
            url = movie.imdb_id,
            displayText = "IMDB URL",
        )
        Spacer(modifier = Modifier.size(8.dp))
        Text(
            text = movie.overview,
            style = MaterialTheme.typography.bodySmall,
            maxLines = 3,
            overflow = TextOverflow.Ellipsis,
        )
        Spacer(modifier = Modifier.size(8.dp))
        Button(
            onClick = onNavigateToThirdScreen,
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth()
        ){
            Text("Got to Third Screen")
        }
    }
}

@Composable
fun HyperlinkText(url: String, displayText: String) {
    val uriHandler = LocalUriHandler.current
    if (url.isNotBlank()) {
        Text(
            text = displayText,
            color = Color(0xFF1E88E5), // Optional: blue color
            style = TextStyle(
                textDecoration = TextDecoration.Underline,
                fontSize = 16.sp
            ),
            modifier = Modifier.clickable {
                uriHandler.openUri(url)
            }
        )
    }
}



