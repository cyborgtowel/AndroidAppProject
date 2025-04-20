package com.ltu.M7019E.lowellsapp.database

import com.ltu.M7019E.lowellsapp.model.Movie
import com.ltu.M7019E.lowellsapp.model.Genre

class Movies {
    fun getMovies(): List<Movie> {
        return listOf(
            Movie(
                id = 324544,
                title = "In the Lost Lands",
                genres= listOf(
                    Genre(id = 12, name = "Adventure"),
                    Genre(id = 14, name = "Fantasy"),
                    Genre(id = 28, name = "Action"),
                ),
                homepage = "https://inthelostlands.com",
                imdb_id = "https://www.imdb.com/title/tt4419684/",
                posterPath = "/iHf6bXPghWB6gT8kFkL1zo00x6X.jpg",
                backdropPath = "/2Nti3gYAX513wvhp8IiLL6ZDyOm.jpg",
                releaseDate = "2025-02-27",
                overview = "A queen sends the powerful and feared sorceress Gray Alys to the ghostly wilderness of the Lost Lands in search of a magical power, where the sorceress and her guide, the drifter Boyce must outwit and outfight man and demon."
            ),
            Movie(
                id = 950387,
                title = "A Minecraft Movie",
                genres = listOf(
                    Genre(id = 10751, name = "Family"),
                    Genre(id = 35, name = "Comedy"),
                    Genre(id = 12, name = "Adventure"),
                    Genre(id = 14, name = "Fantasy")
                ),
                homepage = "https://www.minecraft-movie.com",
                imdb_id = "https://www.imdb.com/title/tt3566834/",
                posterPath = "/yFHHfHcUgGAxziP1C3lLt0q2T4s.jpg",
                backdropPath = "/k32XKMjmXMGeydykD32jfER3BVI.jpg",
                releaseDate = "2025-03-31",
                overview = "Four misfits find themselves struggling with ordinary problems when they are suddenly pulled through a mysterious portal into the Overworld: a bizarre, cubic wonderland that thrives on imagination. To get back home, they'll have to master this world while embarking on a magical quest with an unexpected, expert crafter, Steve."
            ),
            Movie(
                id = 1045938,
                title = "G20",
                genres = listOf(
                    Genre(id = 28, name = "Action"),
                    Genre(id = 18, name = "Drama"),
                    Genre(id = 9648, name = "Mystery")
                ),
                homepage = "https://www.amazon.com/dp/B0DV3V4HH6",
                imdb_id = "https://www.imdb.com/title/tt23476986/",
                posterPath = "/tSee9gbGLfqwvjoWoCQgRZ4Sfky.jpg",
                backdropPath = "/sNx1A3822kEbqeUxvo5A08o4N7o.jpg",
                releaseDate = "2025-04-09",
                overview = "After the G20 Summit is overtaken by terrorists, President Danielle Sutton must bring all her statecraft and military experience to defend her family and her fellow leaders."
            ),
            Movie(
                id = 1195506,
                title = "Novocaine",
                genres = listOf(
                    Genre(id = 28, name = "Action"),
                    Genre(id = 35, name = "Comedy"),
                    Genre(id = 53, name = "Thriller")
                ),
                homepage = "https://www.novocainemovie.com",
                imdb_id = "https://www.imdb.com/title/tt29603959/",
                posterPath = "/xmMHGz9dVRaMY6rRAlEX4W0Wdhm.jpg",
                backdropPath = "/zksO4lVnRKRoaSYzh2EDn2Z3Pel.jpg",
                releaseDate = "2025-03-12",
                overview = "When the girl of his dreams is kidnapped, everyman Nate turns his inability to feel pain into an unexpected strength in his fight to get her back."
            ),
            Movie(
                id = 1293286,
                title = "Gunslingers",
                genres = listOf(
                    Genre(id = 28, name = "Action"),
                    Genre(id = 37, name = "Western")
                ),
                homepage = "http://www.lionsgate.com/movies/guslingers",
                imdb_id = "https://www.imdb.com/title/tt24850708/",
                posterPath = "/O7REXWPANWXvX2jhQydHjAq2DV.jpg",
                backdropPath = "/ce3prrjh9ZehEl5JinNqr4jIeaB.jpg",
                releaseDate = "2025-04-11",
                overview = "When the most wanted man in America surfaces in a small Kentucky town, his violent history -- and a blood-thirsty mob seeking vengeance and a king’s ransom -- soon follow. As brothers face off against one another and bullets tear the town to shreds, this lightning-fast gunslinger makes his enemies pay the ultimate price for their greed."
            ),
        )
    }
}
