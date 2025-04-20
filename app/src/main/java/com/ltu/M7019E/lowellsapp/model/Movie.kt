package com.ltu.M7019E.lowellsapp.model


data class Genre(
    val id: Int,
    val name: String
)

data class Movie(
    var id: Long = 0L,
    var title: String,
    var genres: List<Genre> = listOf(),
    var imdb_id: String,
    var homepage: String,
    var posterPath: String,
    var backdropPath: String,
    var releaseDate: String,
    var overview: String
)