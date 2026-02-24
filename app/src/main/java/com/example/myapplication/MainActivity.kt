package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.DividerItemDecoration


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.rvNews)

        // Set LayoutManager
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.addItemDecoration(
            DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        )

        // Create list of news
        val newsList = listOf(
            News(
                "AI Education Platform Launched",
                "A new AI-powered platform helps students learn faster and smarter.",
                R.drawable.education
            ),
            News(
                "Global Financial Markets Rise",
                "Stock markets worldwide saw significant growth this week.",
                R.drawable.financial
            ),
            News(
                "Localization Technology Advances",
                "New GPS and indoor positioning systems improve global navigation.",
                R.drawable.localization
            ),
            News(
                "Robotic Hand Breakthrough",
                "Engineers developed a robotic hand with human-like precision.",
                R.drawable.robotic_hand
            ),
            News(
                "Championship Sports Update",
                "The national team secured a dramatic last-minute victory.",
                R.drawable.sports
            ),
            News(
                "Extreme Weather Alert",
                "Heavy storms are expected across several regions this weekend.",
                R.drawable.weather
            )
        )

        // Set Adapter
        recyclerView.adapter = NewsAdapter(newsList)
    }
}