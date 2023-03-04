package com.example.movie_review_app


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.movie_review_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    val list = arrayListOf<Movie>()


    val Movie_Adapter = mv_Adapter(list)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        list.add(Movie("1", "더 글로리", "song"))
        list.add(Movie("2", "수리남", "hwang"))
        list.add(Movie("3", "Narcors", "Fabro"))


        binding.rvlist.adapter = Movie_Adapter
        binding.rvlist.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

    }


}