package com.nikita.kut.android.moview.feature.main

import android.os.Bundle
import android.view.View
import com.nikita.kut.android.moview.app.util.ViewBindingFragment
import com.nikita.kut.android.moview.databinding.FragmentMainBinding
import com.nikita.kut.android.moview.feature.movieslist.presentation.FragmentMoviesList

class MainFragment : ViewBindingFragment<FragmentMainBinding>(FragmentMainBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        openFragment()
    }

    private fun openFragment() {
        requireActivity().supportFragmentManager
            .beginTransaction()
            .replace(binding.fragmentMainContainer.id, FragmentMoviesList.newInstance())
            .commit()
    }


    companion object {

        const val MAIN_FRAGMENT_TAG = "MAIN_FRAGMENT_TAG"

        fun newInstance(): MainFragment = MainFragment()
    }
}