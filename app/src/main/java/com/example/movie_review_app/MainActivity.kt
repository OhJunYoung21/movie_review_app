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

        list.add(movie("Matrix", "Keeanu Reeves"))
        list.add(movie("iron man", "Robert Downey.jr"))
        list.add(movie("Transformer", "Shya Rabof"))
        list.add(movie("At the world's end", "Jonny Depp"))
        list.add(movie("Avengers", "Scarlett johanson"))
        list.add(movie("Doctor Strange", "Benedict Cumberbatch"))
        list.add(movie("Aquaman", "Jason Momoa"))
        list.add(movie("At the world's end", "Jonny Depp"))
        list.add(movie("Matrix", "Keeanu Reeves"))
        list.add(movie("iron man", "Robert Downey.jr"))
        list.add(movie("Transformer", "Shya Rabof"))
        list.add(movie("At the world's end", "Jonny Depp"))

        binding.rvlist.adapter = Adapter
        binding.rvlist.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)


    }
}