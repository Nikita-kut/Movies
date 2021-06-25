package com.nikita.kut.android.moview.app.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nikita.kut.android.moview.feature.moviesdetails.FragmentMoviesDetails
import com.nikita.kut.android.moview.feature.movieslist.FragmentMoviesList
import com.nikita.kut.android.moview.R

private val detailsMoviesFragment = FragmentMoviesDetails()
private val listMoviesFragment = FragmentMoviesList()

class MainActivity : AppCompatActivity(), FragmentMoviesList.ClickListener, FragmentMoviesDetails.DetailsClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.activity_main_container, listMoviesFragment)
                    .commit()
            }
        }
    }

    override fun onCardClick() {
        supportFragmentManager.beginTransaction().apply {
            addToBackStack(null)
            replace(R.id.activity_main_container, detailsMoviesFragment)
                .commit()
        }
    }

    override fun onBackButtonClick() {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.activity_main_container, listMoviesFragment)
                .commit()
        }
    }

}