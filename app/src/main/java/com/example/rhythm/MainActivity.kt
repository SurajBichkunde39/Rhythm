package com.example.rhythm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rhythm.ui.MusicListFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        launchMusicListFragment()
    }

    private fun launchMusicListFragment() {
        val musicListFragment = MusicListFragment.newInstance()
        with(supportFragmentManager.beginTransaction()) {
            add(R.id.fragment_container, musicListFragment)
            commitNow()
        }
    }
}