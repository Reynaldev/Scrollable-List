package com.reyndev.scrollablelist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.reyndev.scrollablelist.adapter.ItemAdapter
import com.reyndev.scrollablelist.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataset = DataSource().loadStringItem()

        val recyclerView: RecyclerView = findViewById(R.id.rvItem)
        recyclerView.adapter = ItemAdapter(this, dataset)
        recyclerView.setHasFixedSize(true)
    }
}