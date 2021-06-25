package com.nikita.kut.android.moview.feature.moviesdetails.presentation

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nikita.kut.android.moview.app.repository.ActorRepository
import com.nikita.kut.android.moview.app.util.AutoClearedValue
import com.nikita.kut.android.moview.app.util.ViewBindingFragment
import com.nikita.kut.android.moview.databinding.FragmentMoviesDetailsBinding
import com.nikita.kut.android.moview.feature.moviesdetails.presentation.adapter.ActorAdapter
import com.nikita.kut.android.moview.feature.movieslist.model.Movie

class FragmentMoviesDetails :
    ViewBindingFragment<FragmentMoviesDetailsBinding>(FragmentMoviesDetailsBinding::inflate) {

    private var actorAdapter by AutoClearedValue<ActorAdapter>()

    private val repository = ActorRepository()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRvActors()
        binding.btnBack.setOnClickListener {
            requireActivity().supportFragmentManager.popBackStack()
        }
    }

    private fun initRvActors() {
        actorAdapter = ActorAdapter()
        with(binding.rvActorList) {
            adapter = actorAdapter
            layoutManager = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
            setHasFixedSize(true)
        }
        actorAdapter.updateList(repository.actorList)
    }

    companion object {
        private const val KEY_MOVIE = "KEY_MOVIE"
        fun newInstance(movie: Movie): FragmentMoviesDetails = FragmentMoviesDetails().apply {
            arguments = bundleOf(KEY_MOVIE to movie)
        }
    }

}