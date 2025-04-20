package com.ltu.M7019E.lowellsapp.ui.theme.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.ltu.M7019E.lowellsapp.model.Genre
import com.ltu.M7019E.lowellsapp.model.Movie
import com.ltu.M7019E.lowellsapp.ui.theme.LowellsAppTheme
import com.ltu.M7019E.lowellsapp.utils.Constants

@Composable
fun MovieListScreen(movieList: List<Movie>,
                    onMovieListItemClicked: (Movie) -> Unit,
                    modifier: Modifier = Modifier){
    LazyColumn(modifier = modifier) {
        items(movieList){ movie ->
            MovieListItemCard(
                movie = movie,
                onMovieListItemClicked,
                modifier = Modifier.padding(8.dp)
            )
        }

    }
}
@Composable
fun MovieListItemCard(
        movie: Movie,
        onMovieListItemClicked: (Movie) -> Unit,
        modifier: Modifier = Modifier
){
    Card(
        modifier = modifier,
        onClick ={
            onMovieListItemClicked(movie)
        }
    ){
        Row {
            Box{
                AsyncImage(
                    model = Constants.POSTER_IMAGE_BASE_URL + Constants.POSTER_IMAGE_WIDTH + movie.posterPath,
                    contentDescription = movie.title,
                    modifier = modifier
                        .width(92.dp)
                        .height(138.dp),
                    contentScale = ContentScale.Crop
                )

            }
            Column{
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
                    text = movie.overview,
                    style = MaterialTheme.typography.bodySmall,
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis,
                )
                Spacer(modifier = Modifier.size(8.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MovieItemPreview() {
    LowellsAppTheme {
        MovieListItemCard(
            movie = Movie(
                id = 324544,
                title = "In the Lost Lands",
                genres= listOf(
                    Genre(id = 12, name = "Adventure"),
                    Genre(id = 14, name = "Fantasy"),
                    Genre(id = 28, name = "Action"),
                ),
                imdb_id = "tt4419684",
                homepage = "https://inthelostlands.com",
                posterPath = "/iHf6bXPghWB6gT8kFkL1zo00x6X.jpg",
                backdropPath = "/2Nti3gYAX513wvhp8IiLL6ZDyOm.jpg",
                releaseDate = "2025-02-27",
                overview = "A queen sends the powerful and feared sorceress Gray Alys to the ghostly wilderness of the Lost Lands in search of a magical power, where the sorceress and her guide, the drifter Boyce must outwit and outfight man and demon."
            ), {}
        )
    }
}