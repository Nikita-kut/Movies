package com.nikita.kut.android.moview.app.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nikita.kut.android.moview.feature.moviesdetails.FragmentMoviesDetails
import com.nikita.kut.android.moview.feature.movieslist.presentation.FragmentMoviesList
import com.nikita.kut.android.moview.R
import com.nikita.kut.android.moview.databinding.ActivityMainBinding
import com.nikita.kut.android.moview.feature.main.MainFragment

class MainActivity : AppCompatActivity(),
    FragmentMoviesDetails.DetailsClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(
                    binding.activityMainContainer.id,
                    MainFragment.newInstance(),
                    MainFragment.MAIN_FRAGMENT_TAG
                )
                .commit()
        }
    }

    override fun onBackPressed() {
        val mainFragmentFragmentManager = supportFragmentManager
            .findFragmentByTag(MainFragment.MAIN_FRAGMENT_TAG)
            ?.childFragmentManager
        val backStackCount =
            mainFragmentFragmentManager
                ?.backStackEntryCount
        if (backStackCount == null) {
            super.onBackPressed()
        } else {
            if (backStackCount > 0) {
                mainFragmentFragmentManager.popBackStack()
            } else {
                super.onBackPressed()
            }
        }
    }


    override fun onBackButtonClick() {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.activity_main_container, FragmentMoviesList.newInstance())
                .commit()
        }
    }

}