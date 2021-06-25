package com.nikita.kut.android.moview.feature.moviesdetails.presentation.adapter

import androidx.recyclerview.widget.DiffUtil
import com.nikita.kut.android.moview.feature.moviesdetails.model.Actor

class ActorDiffUtilCallback : DiffUtil.ItemCallback<Actor>() {
    override fun areItemsTheSame(oldItem: Actor, newItem: Actor): Boolean = oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Actor, newItem: Actor): Boolean = oldItem == newItem
}