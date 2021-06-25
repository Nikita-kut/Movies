package com.nikita.kut.android.moview.feature.movieslist

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import com.nikita.kut.android.moview.R
import com.nikita.kut.android.moview.app.util.ViewBindingFragment
import com.nikita.kut.android.moview.databinding.FragmentMoviesListBinding

class FragmentMoviesList :
    ViewBindingFragment<FragmentMoviesListBinding>(FragmentMoviesListBinding::inflate) {

    private var cardMovie: ConstraintLayout? = null
    private var listener: ClickListener? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        cardMovie = view.findViewById(R.id.card_movie)
        cardMovie?.setOnClickListener {
            listener?.onCardClick()
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is ClickListener)
            listener = context
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }


    interface ClickListener {
        fun onCardClick()
    }

    companion object {
        fun newInstance(): FragmentMoviesList = FragmentMoviesList()
    }
}