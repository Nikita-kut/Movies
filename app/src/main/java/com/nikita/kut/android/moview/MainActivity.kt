package com.nikita.kut.android.moview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

private val detailsMoviesFragment = FragmentMoviesDetails()
private val listMoviesFragment = FragmentMoviesList()

class MainActivity : AppCompatActivity(), FragmentMoviesList.ClickListener, FragmentMoviesDetails.DetailsClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container, listMoviesFragment)
                    .commit()
            }
        }
    }

    override fun onCardClick() {
        supportFragmentManager.beginTransaction().apply {
            addToBackStack(null)
            replace(R.id.fragment_container, detailsMoviesFragment)
                .commit()
        }
    }

    override fun onBackButtonClick() {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, listMoviesFragment)
                .commit()
        }
    }

}