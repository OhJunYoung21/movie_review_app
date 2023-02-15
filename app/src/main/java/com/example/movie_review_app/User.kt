package com.example.movie_review_app

data class User(
    val name: String,
    val email: String,
    val uid: String
) {
    constructor() : this("", "", "")
}
