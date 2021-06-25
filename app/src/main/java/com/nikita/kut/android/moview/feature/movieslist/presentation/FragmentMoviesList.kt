package com.nikita.kut.android.moview.feature.movieslist.presentation

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.nikita.kut.android.moview.R
import com.nikita.kut.android.moview.app.repository.MovieRepository
import com.nikita.kut.android.moview.app.util.AutoClearedValue
import com.nikita.kut.android.moview.app.util.ViewBindingFragment
import com.nikita.kut.android.moview.databinding.FragmentMoviesListBinding
import com.nikita.kut.android.moview.feature.moviesdetails.FragmentMoviesDetails
import com.nikita.kut.android.moview.feature.movieslist.model.Movie
import com.nikita.kut.android.moview.feature.movieslist.presentation.adapter.MovieAdapter

class FragmentMoviesList :
    ViewBindingFragment<FragmentMoviesListBinding>(FragmentMoviesListBinding::inflate),
    MovieAdapter.OnMovieItemClick {

    private var movieAdapter by AutoClearedValue<MovieAdapter>()

    private val repository = MovieRepository()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRvMovie()
    }

    private fun initRvMovie() {
        movieAdapter = MovieAdapter()
        with(binding.rvMovieList) {
            adapter = movieAdapter
            movieAdapter.setClickListener(this@FragmentMoviesList)
            layoutManager = GridLayoutManager(requireContext(), 2)
            setHasFixedSize(true)
        }
        movieAdapter.updateList(repository.movieList)
    }

    override fun onMovieClick(movie: Movie) {
        requireActivity().supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_main_container, FragmentMoviesDetails.newInstance(movie))
            .addToBackStack(null)
            .commit()
    }

    companion object {
        fun newInstance(): FragmentMoviesList = FragmentMoviesList()
    }
}