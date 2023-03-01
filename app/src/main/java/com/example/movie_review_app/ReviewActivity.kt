package com.example.movie_review_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class ReviewActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review)

        val person = findViewById<TextView>(R.id.reviewname)

        val movieintent: Intent = getIntent()

        val actor: String? = movieintent.getStringExtra("배우")

        person.text = actor


    }
}