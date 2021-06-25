package com.nikita.kut.android.moview.feature.movieslist.presentation.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nikita.kut.android.moview.databinding.ItemMovieBinding
import com.nikita.kut.android.moview.feature.movieslist.model.Movie

class MovieViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemMovieBinding.bind(view)
    lateinit var listener: MovieAdapter.OnMovieItemClick

    fun bind(movie: Movie, listener: MovieAdapter.OnMovieItemClick) {
        Glide.with(itemView)
            .load(movie.moviePicture)
            .dontAnimate()
            .centerCrop()
            .into(binding.moviePicture)
        binding.tvGenreSmall.text = movie.movieGenre
        binding.tvReviewCount.text = movie.reviewCount.toString()
        binding.movieName.text = movie.movieName
        binding.movieLength.text = movie.movieLength.toString()
        this.listener = listener
        itemView.setOnClickListener {
            listener.onMovieClick(movie)
        }
    }

}