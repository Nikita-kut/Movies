package com.nikita.kut.android.moview.feature.movieslist.model

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.parcelize.Parcelize
import kotlin.random.Random

@Parcelize
data class Movie(
    val id: Int = Random.nextInt(),
    @DrawableRes val moviePicture: Int,
    val movieGenre: String,
    val reviewCount: Int,
    val movieName: String,
    val movieLength: Int,
) : Parcelable
