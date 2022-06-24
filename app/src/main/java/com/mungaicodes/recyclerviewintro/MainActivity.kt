package com.mungaicodes.recyclerviewintro

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mungaicodes.recyclerviewintro.adapter.ItemAdapter
import com.mungaicodes.recyclerviewintro.data.DataSource
import com.mungaicodes.recyclerviewintro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myDataset = DataSource().loadAffirmation()
        val recyclerView = binding.recyclerView

        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)

    }
}