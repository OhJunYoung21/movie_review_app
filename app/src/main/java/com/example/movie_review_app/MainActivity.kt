package com.example.movie_review_app

import android.annotation.SuppressLint
import android.app.LauncherActivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.movie_review_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    var list = arrayListOf<movie>()
    val Adapter = mv_Adapter(list)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        list.add(movie("iron man2", "Robert Downey.jr"))
        list.add(movie("iron man3", "Robert Downey.jr"))

        binding.rvlist.adapter = Adapter
        binding.rvlist.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)


    }
}