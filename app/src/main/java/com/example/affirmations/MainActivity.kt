package com.example.affirmations

import ItemAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.data.datasource
import javax.sql.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myDataSet=datasource().loadAffirmation()
        val recyclerView=findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter=ItemAdapter(this,myDataSet)
        recyclerView.setHasFixedSize(true)

    }
}