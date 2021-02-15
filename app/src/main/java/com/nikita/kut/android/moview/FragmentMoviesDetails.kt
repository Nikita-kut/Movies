package com.nikita.kut.android.moview

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment

class FragmentMoviesDetails : Fragment() {

    private var btnBack: LinearLayout? = null
    private var listener: DetailsClickListener? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_movies_details, container, false)

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

}