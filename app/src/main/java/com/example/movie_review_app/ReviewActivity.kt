package com.example.movie_review_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class ReviewActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review)

        val title = findViewById<TextView>(R.id.reviewtitle)
        val actorreview = findViewById<TextView>(R.id.reviewactor)


        val movieintent: Intent = getIntent()  //intent를 받아오는 함수

        val actor: String? = movieintent.getStringExtra("배우")
        val mv_title: String? = movieintent.getStringExtra("제목")

        actorreview.text = actor
        title.text = mv_title


    }
}