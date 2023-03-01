package com.example.movie_review_app



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.movie_review_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    var list = arrayListOf<movie>()
    val Movie_Adapter = mv_Adapter(list)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        list.add(movie("1", "매트릭스", "keeanu", "review"))
        list.add(movie("2", "아이언맨", "Robert", "review"))
        list.add(movie("3", "수리남", "hwang", "review"))
        list.add(movie("4", "종이의 집", "tokyo", "review"))
        list.add(movie("5", "더 글로리", "song", "review"))
        list.add(movie("6", "카지노", "choi", "review"))



        binding.rvlist.adapter = Movie_Adapter
        binding.rvlist.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

    }


}