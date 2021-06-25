package com.nikita.kut.android.moview.app.repository

import com.nikita.kut.android.moview.R
import com.nikita.kut.android.moview.feature.movieslist.model.Movie

class MovieRepository {

    val movieList = listOf(
        Movie(moviePicture = R.drawable.movie_poster, movieGenre = "Action", reviewCount = 150, movieName = "Avengers", movieLength = 140),
        Movie(moviePicture = R.drawable.movie_poster, movieGenre = "Adventure", reviewCount = 1502, movieName = "Avengers 232", movieLength = 155),
        Movie(moviePicture = R.drawable.movie_poster, movieGenre = "Documental", reviewCount = 121, movieName = "Avengers 32131", movieLength = 654),
        Movie(moviePicture = R.drawable.movie_poster, movieGenre = "News", reviewCount = 2666, movieName = "Avengers 321", movieLength = 4353),
        Movie(moviePicture = R.drawable.movie_poster, movieGenre = "Comedy", reviewCount =4324, movieName = "Avengers 3121", movieLength = 9885),
        Movie(moviePicture = R.drawable.movie_poster, movieGenre = "Action", reviewCount = 5436, movieName = "Avengers y5", movieLength = 436),
        Movie(moviePicture = R.drawable.movie_poster, movieGenre = "Adventure", reviewCount = 54, movieName = "Avengers 753", movieLength = 9786),
        Movie(moviePicture = R.drawable.movie_poster, movieGenre = "News", reviewCount = 696, movieName = "Avengers 52", movieLength = 432),
        Movie(moviePicture = R.drawable.movie_poster, movieGenre = "Action", reviewCount = 1433, movieName = "Avengers 976", movieLength = 3678),
        Movie(moviePicture = R.drawable.movie_poster, movieGenre = "News", reviewCount = 1906, movieName = "Avengers 1144", movieLength = 853),
        Movie(moviePicture = R.drawable.movie_poster, movieGenre = "Comedy", reviewCount = 1325, movieName = "Avengers 3", movieLength = 4788),
        Movie(moviePicture = R.drawable.movie_poster, movieGenre = "Action", reviewCount = 8656, movieName = "Avengers 7753", movieLength = 3256),
    )

}