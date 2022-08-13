package com.grinta.mylibrary

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    var musicFlag = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.setBackgroundDrawable(
            ColorDrawable(Color.parseColor("#FF8C00"))
        ) //Change the colo of action bar

        val categorySEL: Spinner = findViewById(R.id.categoryID)
        var categories = arrayOf("Novels", "Human Development", "Child")
        var flag: String = "Novels"
        val NovelFrag = Novels()
        val HumanDevelopmentFrag = HumanDevelopment()
        val ChildFrag = Child()

        startService(Intent(this, MusicService::class.java)) //Run the music

        categorySEL.adapter = ArrayAdapter<String>(
            this, android.R.layout.simple_list_item_1, categories
        )

        categorySEL.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = categories.get(p2)

                when(flag){
                    "Novels" -> setFragment(NovelFrag)
                    "Human Development" -> setFragment(HumanDevelopmentFrag)
                    "Child" -> setFragment(ChildFrag)
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.mainmenu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val FavouriteIntent = Intent(this, MyFavourite::class.java)

        if (item.itemId == R.id.item2 && musicFlag==1) {
            musicFlag = 0
            stopService(Intent(this, MusicService::class.java))
            item.setIcon(R.drawable.ic_baseline_music_off_24)
        }

        else if (item.itemId == R.id.item2 && musicFlag==0){
            musicFlag = 1
            startService(Intent(this, MusicService::class.java))
            item.setIcon(R.drawable.ic_baseline_music_note_24)
        }

        else{
            startActivity(FavouriteIntent)
        }
        return super.onOptionsItemSelected(item)
    }

    fun setFragment(frag: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.framelayout, frag)
            commit()
        }
    }


}

