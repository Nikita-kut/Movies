package com.nikita.kut.android.moview.app.repository

import com.nikita.kut.android.moview.R
import com.nikita.kut.android.moview.feature.moviesdetails.model.Actor

class ActorRepository {
    val actorList = listOf(
        Actor(actorPicture = R.drawable.robert_downie, actorName = R.string.robert_downey_jr),
        Actor(actorPicture = R.drawable.chris_evans, actorName = R.string.chris_evans),
        Actor(actorPicture = R.drawable.mark_rufalo, actorName = R.string.mark_ruffalo),
        Actor(actorPicture = R.drawable.chris_hemsvort, actorName = R.string.chris_hemsworth),
    )
}