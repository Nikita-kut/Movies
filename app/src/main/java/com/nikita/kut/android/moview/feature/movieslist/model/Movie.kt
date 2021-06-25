package com.nikita.kut.android.moview.feature.movieslist.model

import androidx.annotation.DrawableRes
import kotlin.random.Random

data class Movie(
    val id: Int = Random.nextInt(),
    @DrawableRes val moviePicture: Int,
    val movieGenre: String,
    val reviewCount: Int,
    val movieName: String,
    val movieLength: Int,
)
