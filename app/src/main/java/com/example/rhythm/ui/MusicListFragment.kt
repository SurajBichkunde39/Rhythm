package com.example.rhythm.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.rhythm.R
import dagger.hilt.android.AndroidEntryPoint

/**
 * A fragment to display list of music with user preferences, mini-player, search
 * and control option.
 */
@AndroidEntryPoint
class MusicListFragment : Fragment(R.layout.fragment_music_list) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    companion object {
        fun newInstance() = MusicListFragment()
    }
}
