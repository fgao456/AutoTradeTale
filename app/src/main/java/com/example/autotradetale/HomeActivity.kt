package com.example.autotradetale

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val recyclerView: RecyclerView = findViewById(R.id.homeRecyclerView)
        val itemDataList = listOf(
            ItemData(R.drawable.buick_encore_2023, resources.getResourceEntryName(R.drawable.buick_encore_2023)),
            ItemData(R.drawable.audi_q3_2021, resources.getResourceEntryName(R.drawable.audi_q3_2021)),
            ItemData(R.drawable.cadillac_xt4_2023, resources.getResourceEntryName(R.drawable.cadillac_xt4_2023)),
            ItemData(R.drawable.jeep_wrangler_2019, resources.getResourceEntryName(R.drawable.jeep_wrangler_2019)),
            ItemData(R.drawable.chevrolet_equinox_2024, resources.getResourceEntryName(R.drawable.chevrolet_equinox_2024)),
            // Add more items as needed
        )

        val adapter = RecyclerViewAdapter(itemDataList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        val buttonFilter = findViewById<Button>(R.id.filterButton)
        // Set the onClickListener for the Back button
        buttonFilter.setOnClickListener {
            // Switch to Filter page
            val intent = Intent(this, FilterActivity::class.java)
            startActivity(intent)
        }

        val buttonProfile = findViewById<ImageButton>(R.id.profileButton)
        // Set the onClickListener for the Back button
        buttonProfile.setOnClickListener {
            // Switch to Filter page
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}