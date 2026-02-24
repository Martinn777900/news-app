package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.rvNews)

        // Set LayoutManager
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Create list of news
        val newsList = listOf(
            News(
                "This is the news title",
                "This is the news description and it contains a summary of what happened"
            ),
            News(
                "This is the news title",
                "This is the news description and it contains a summary of what happened"
            ),
            News(
                "This is the news title",
                "This is the news description and it contains a summary of what happened"
            ),
            News(
                "This is the news title",
                "This is the news description and it contains a summary of what happened"
            ),
            News(
                "This is the news title",
                "This is the news description and it contains a summary of what happened"
            )
        )

        // Set Adapter
        recyclerView.adapter = NewsAdapter(newsList)
    }
}