package com.gruposalinas.movies4u

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.gruposalinas.movies4u.databinding.ActivityMainBinding
import com.gruposalinas.movies4u.model.Movie
import com.gruposalinas.movies4u.model.MovieResponse
import com.gruposalinas.movies4u.services.MovieApiInterface
import com.gruposalinas.movies4u.services.MovieApiService
import com.gruposalinas.movies4u.view.MovieAdapter
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNow.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow_500))
        binding.btnPopular.setBackgroundColor(Color.WHITE)

        binding.btnNow.setOnClickListener {
            binding.btnNow.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow_500))
            binding.btnPopular.setBackgroundColor(Color.WHITE)
        }

        binding.btnPopular.setOnClickListener {
            binding.btnNow.setBackgroundColor(Color.WHITE)
            binding.btnPopular.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow_500))
            Toast.makeText(this, "Sección en construcción...", Toast.LENGTH_LONG).show()
        }

        rv_movies_list.layoutManager = LinearLayoutManager(this)
        rv_movies_list.setHasFixedSize(true)
        getMovieData { movies: List<Movie> ->
            rv_movies_list.adapter = MovieAdapter(movies)
        }

    }

    private fun getMovieData(callback: (List<Movie>) -> Unit) {
        val apiService = MovieApiService.getInstance().create(MovieApiInterface::class.java)
        apiService.getMovieList().enqueue(object : Callback<MovieResponse> {
            override fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>) {
                return callback(response.body()!!.movies)
            }

            override fun onFailure(call: Call<MovieResponse>, t: Throwable) {
                showErrorMessage()
            }

        })
    }

    private fun showErrorMessage() {
        Toast.makeText(this, "Error", Toast.LENGTH_LONG).show()
    }
}