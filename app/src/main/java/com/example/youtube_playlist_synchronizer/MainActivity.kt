package com.example.youtube_playlist_synchronizer

import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageButton
import com.example.youtube_playlist_synchronizer.ui.main.SectionsPagerAdapter
import com.example.youtube_playlist_synchronizer.databinding.ActivityMainBinding
import com.example.youtube_playlist_synchronizer.ui.main.StatusFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val setbtn: ImageButton = binding.setbtn
        setbtn.setOnClickListener{ view ->
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = binding.viewPager
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = binding.tabs
        tabs.setupWithViewPager(viewPager)
        val fab: FloatingActionButton = binding.fab

        fab.setOnClickListener { view ->
            StatusFragment.updatetextview(this, "new")
        }
    }


}