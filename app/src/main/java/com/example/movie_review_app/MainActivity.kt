package com.example.movie_review_app



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.movie_review_app.databinding.ActivityMainBinding
import org.json.JSONObject
import java.net.URL

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    var list = arrayListOf<movie>()
    val Movie_Adapter = mv_Adapter(list)


    val url = "https://api.themoviedb.org/3/movie/latest?api_key=3e32bbc8b184991be71b7fdfb0ef2c92"

    val response = URL(url).readText()


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


        val movieList = mutableListOf<ApiMovie>()

        val jsonResponse = JSONObject(response)
        val movieData = jsonResponse.getJSONObject("results")
        val movieArray = movieData.getJSONArray("results")

        for (i in 0 until movieArray.length()) {
            val movieObject = movieArray.getJSONObject(i)
            val movie = ApiMovie(
                id = movieObject.getInt("id"),
                title = movieObject.getString("title"),
                releaseDate = movieObject.getString("release_date"),
                overview = movieObject.getString("overview"),
                posterUrl = "https://image.tmdb.org/t/p/w500" + movieObject.getString("poster_path"),
                voteAverage = movieObject.getDouble("vote_average")
            )
            movieList.add(movie)
        }



    }




}