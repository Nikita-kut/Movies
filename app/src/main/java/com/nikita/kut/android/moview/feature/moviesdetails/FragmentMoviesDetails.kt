package com.nikita.kut.android.moview.feature.moviesdetails

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.nikita.kut.android.moview.R
import com.nikita.kut.android.moview.app.util.ViewBindingFragment
import com.nikita.kut.android.moview.databinding.FragmentMoviesDetailsBinding

class FragmentMoviesDetails :
    ViewBindingFragment<FragmentMoviesDetailsBinding>(FragmentMoviesDetailsBinding::inflate) {

    private var btnBack: LinearLayout? = null
    private var listener: DetailsClickListener? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnBack = view.findViewById(R.id.btn_back)
        btnBack?.setOnClickListener {
            listener?.onBackButtonClick()
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is DetailsClickListener)
            listener = context
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    interface DetailsClickListener {
        fun onBackButtonClick()
    }

    companion object {
        fun newInstance(): FragmentMoviesDetails = FragmentMoviesDetails()
    }

}