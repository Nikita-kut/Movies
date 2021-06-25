package com.nikita.kut.android.moview.feature.moviesdetails

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.nikita.kut.android.moview.R
import com.nikita.kut.android.moview.app.util.ViewBindingFragment
import com.nikita.kut.android.moview.databinding.FragmentMoviesDetailsBinding
import com.nikita.kut.android.moview.feature.movieslist.model.Movie

class FragmentMoviesDetails :
    ViewBindingFragment<FragmentMoviesDetailsBinding>(FragmentMoviesDetailsBinding::inflate) {

    private var listener: DetailsClickListener? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
            listener?.onBackButtonClick()

    }

    interface DetailsClickListener {
        fun onBackButtonClick()
    }

    companion object {
        private const val KEY_MOVIE = "KEY_MOVIE"
        fun newInstance(movie: Movie): FragmentMoviesDetails = FragmentMoviesDetails().apply {
            arguments = bundleOf(KEY_MOVIE to movie)
        }
    }

}