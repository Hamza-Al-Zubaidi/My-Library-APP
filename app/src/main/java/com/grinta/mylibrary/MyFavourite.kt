package com.grinta.mylibrary

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ListView
import android.widget.SimpleCursorAdapter
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MyFavourite : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_favourite)

        val FavListView: ListView = findViewById(R.id.FavListView)

        supportActionBar?.setBackgroundDrawable(
            ColorDrawable(Color.parseColor("#FF8C00"))
        ) //Change the colo of action bar

        fetchFavouriteList(FavListView)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.favouritemenu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        this.finish() //Back
        return super.onOptionsItemSelected(item)
    }

    @SuppressLint("Recycle")
    fun fetchFavouriteList(FAVList: ListView){
        val cols = listOf<String>(LibraryProvider.NAME, LibraryProvider._ID).toTypedArray()
        val from = listOf<String>(cols[0], cols[1]).toTypedArray()
        val to = intArrayOf(android.R.id.text1, android.R.id.text2)

        val rs = contentResolver.query(LibraryProvider.CONTENT_URI, cols, null, null,
            cols[0]
        )
        val copyAdapter = SimpleCursorAdapter(this, android.R.layout.simple_list_item_1,
            rs, from, to, 0)

        FAVList.adapter = copyAdapter

        val PDFIntent = Intent(this, PDFViewer::class.java)

        FAVList.setOnItemClickListener { adapterView, view, i, l ->
            val FAVListItem: String = (view as TextView).text.toString() //Fetch the name of book
            when(FAVListItem){
                "Harry Potter" -> {
                    PDFIntent.putExtra("Flag", 1)
                    startActivity(PDFIntent)
                }
                "The Alchimest" -> {
                    PDFIntent.putExtra("Flag", 2)
                    startActivity(PDFIntent)
                }
                "Invisible Man" -> {
                    PDFIntent.putExtra("Flag", 3)
                    startActivity(PDFIntent)
                }
                "Alice in Wonderland" -> {
                    PDFIntent.putExtra("Flag", 4)
                    startActivity(PDFIntent)
                }
                "40 Rules of Love" -> {
                    PDFIntent.putExtra("Flag", 5)
                    startActivity(PDFIntent)
                }
                "1984" -> {
                    PDFIntent.putExtra("Flag", 6)
                    startActivity(PDFIntent)
                }
                "The Da Vinci Code" -> {
                    PDFIntent.putExtra("Flag", 7)
                    startActivity(PDFIntent)
                }
                "Rich Dad & Poor Dad" -> {
                    PDFIntent.putExtra("Flag", 8)
                    startActivity(PDFIntent)
                }
                "Attention Revolution" -> {
                    PDFIntent.putExtra("Flag", 9)
                    startActivity(PDFIntent)
                }
                "Laws of Power" -> {
                    PDFIntent.putExtra("Flag", 10)
                    startActivity(PDFIntent)
                }
                "Power of Thinking" -> {
                    PDFIntent.putExtra("Flag", 11)
                    startActivity(PDFIntent)
                }
                "The Power of Now" -> {
                    PDFIntent.putExtra("Flag", 12)
                    startActivity(PDFIntent)
                }
                "Whole New Mind" -> {
                    PDFIntent.putExtra("Flag", 13)
                    startActivity(PDFIntent)
                }
                "Time Management" -> {
                    PDFIntent.putExtra("Flag", 14)
                    startActivity(PDFIntent)
                }
                "Spider Man" -> {
                    PDFIntent.putExtra("Flag", 15)
                    startActivity(PDFIntent)
                }
                "New Kid" -> {
                    PDFIntent.putExtra("Flag", 16)
                    startActivity(PDFIntent)
                }
                "Aladdin" -> {
                    PDFIntent.putExtra("Flag", 17)
                    startActivity(PDFIntent)
                }
                "First 100 Words" -> {
                    PDFIntent.putExtra("Flag", 18)
                    startActivity(PDFIntent)
                }
                "Good Night Moon" -> {
                    PDFIntent.putExtra("Flag", 19)
                    startActivity(PDFIntent)
                }
                "Sonic" -> {
                    PDFIntent.putExtra("Flag", 20)
                    startActivity(PDFIntent)
                }
                "Corduroy" -> {
                    PDFIntent.putExtra("Flag", 21)
                    startActivity(PDFIntent)
                }
            }
        }
    }
}