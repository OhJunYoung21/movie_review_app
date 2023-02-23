package com.example.movie_review_app


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.movie_review_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    var list = arrayListOf<movie>()
    val Movie_Adapter = mv_Adapter(list)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        list.add(movie("1", "Matrix", "keeanu","review"))
        list.add(movie("2", "Ironman", "Robert","review"))
        list.add(movie("3", "Ironman", "Robert","review"))
        list.add(movie("4", "Ironman", "Robert","review"))
        list.add(movie("5", "Ironman", "Robert","review"))
        list.add(movie("6", "Ironman", "Robert","review"))



        binding.rvlist.adapter = Movie_Adapter
        binding.rvlist.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

    }


}