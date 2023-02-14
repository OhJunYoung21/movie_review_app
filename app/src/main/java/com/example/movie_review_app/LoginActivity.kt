package com.example.movie_review_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.movie_review_app.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLoginBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val view = binding.root

        setContentView(view)


    }


}