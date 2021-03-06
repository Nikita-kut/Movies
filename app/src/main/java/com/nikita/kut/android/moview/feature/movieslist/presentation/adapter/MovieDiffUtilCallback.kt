package com.nikita.kut.android.moview.feature.movieslist.presentation.adapter

import androidx.recyclerview.widget.DiffUtil
import com.nikita.kut.android.moview.feature.movieslist.model.Movie

class MovieDiffUtilCallback : DiffUtil.ItemCallback<Movie>() {
    override fun areItemsTheSame(oldItem: Movie, newItem: Movie): Boolean = oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Movie, newItem: Movie): Boolean = oldItem == newItem
}