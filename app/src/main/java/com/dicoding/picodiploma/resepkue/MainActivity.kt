package com.dicoding.picodiploma.resepkue

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.picodiploma.resepkue.model.*

class MainActivity : AppCompatActivity() {
    private lateinit var rvKue: RecyclerView
    private var list: ArrayList<Kue> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvKue = findViewById(R.id.rv_kue)
        rvKue.setHasFixedSize(true)

        list.addAll(kueData.listData)
        showRecyclerlist()
    }

    private fun showRecyclerlist() {
        rvKue.layoutManager = LinearLayoutManager(this)
        val listKueAdapter = ListKueAdapter(list)
        rvKue.adapter = listKueAdapter

    }

        override fun onCreateOptionsMenu(menu: Menu): Boolean {
            menuInflater.inflate(R.menu.menu_main, menu)
            return super.onCreateOptionsMenu(menu)
        }


        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            setMode(item.itemId)
            return super.onOptionsItemSelected(item)
        }
        private fun setMode (selectedMode: Int) {
            when (selectedMode) {
                R.id.action_list -> {
                    showRecyclerlist()
                }
                R.id.action_grid -> {
                    showRecyclerGrid()
                }
                R.id.action_cardview -> {
                    showRecyclerCardView()
                }
            }
        }
    private fun showRecyclerGrid() {
        rvKue.layoutManager = GridLayoutManager(this, 2)
        val gridKueAdapter = GridKueAdapter(list)
        rvKue.adapter = gridKueAdapter
    }

    private fun showRecyclerCardView() {
        rvKue.layoutManager = LinearLayoutManager(this)
        val cardViewKueAdapter = CardViewKueAdapter(list)
        rvKue.adapter = cardViewKueAdapter
    }



}
