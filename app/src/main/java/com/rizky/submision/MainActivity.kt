package com.rizky.submision

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvClothes: RecyclerView
    private var list: ArrayList<Clothes> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvClothes = findViewById(R.id.rv_clothes)
        rvClothes.setHasFixedSize(true)

        list.addAll(ClothesData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvClothes.layoutManager = LinearLayoutManager(this)
        val listClothesAdapter = ClothesAdapter(list)
        rvClothes.adapter = listClothesAdapter

       listClothesAdapter.setOnItemClickCallback(object : ClothesAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Clothes) {
                showSelectedClothes(data)
            }
        })
    }
    private fun showSelectedClothes(cloth: Clothes) {
        Toast.makeText(this, "Kamu memilih " + cloth.name, Toast.LENGTH_SHORT).show()
        
    }
}
