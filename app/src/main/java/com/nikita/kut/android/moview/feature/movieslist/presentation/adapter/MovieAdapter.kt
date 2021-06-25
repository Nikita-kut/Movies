package com.nikita.kut.android.moview.feature.movieslist.presentation.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.RecyclerView
import com.nikita.kut.android.moview.R
import com.nikita.kut.android.moview.app.util.inflate
import com.nikita.kut.android.moview.feature.movieslist.model.Movie

class MovieAdapter : RecyclerView.Adapter<MovieViewHolder>() {

    private val differ = AsyncListDiffer(this, MovieDiffUtilCallback())

    private lateinit var listener: OnMovieItemClick

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder =
        MovieViewHolder(
            parent.inflate(
                R.layout.item_movie
            )
        )

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(differ.currentList[position], listener)
    }

    override fun getItemCount(): Int = differ.currentList.size

    fun updateList(newList: List<Movie>) {
        differ.submitList(newList)
    }

    fun setClickListener(listener: OnMovieItemClick) {
        this.listener = listener
    }

    interface OnMovieItemClick {
        fun onMovieClick(movie: Movie)
    }
}