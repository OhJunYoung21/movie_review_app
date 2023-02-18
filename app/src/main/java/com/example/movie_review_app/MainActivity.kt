package com.example.movie_review_app

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

    val list = arrayListOf<movie>()   //movie class안의 데이터로 구성된 배열
    val adapter = mv_Adapter(list)  //list의 요소를 뷰와 연결시켜주는 어댑터

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)


        binding.rvList.adapter = adapter

        list.add(movie("iron man1", "Robert Downey.jr"))
        list.add(movie("iron man2", "Robert Downey.jr"))
        list.add(movie("iron man3", "Robert Downey.jr"))


    }
}