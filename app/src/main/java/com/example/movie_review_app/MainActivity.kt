package com.example.movie_review_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.movie_review_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    var musicList = arrayListOf<Music>(
        Music("danza Kuduro")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}