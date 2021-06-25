package com.nikita.kut.android.moview.feature.moviesdetails.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import kotlin.random.Random

data class Actor(
    val id: Int = Random.nextInt(),
    @DrawableRes val actorPicture: Int,
    @StringRes val actorName: Int,
)
