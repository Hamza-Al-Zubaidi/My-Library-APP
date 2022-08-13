package com.grinta.mylibrary

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.github.barteksc.pdfviewer.PDFView
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle

class PDFViewer : AppCompatActivity() {
    var musicFlag = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdfviewer)

        supportActionBar?.setBackgroundDrawable(
            ColorDrawable(Color.parseColor("#FF8C00"))
        ) //Change the colo of action bar

        var PDFv: PDFView = findViewById(R.id.pdfViewerID)
        var key: Int = 0
        val bundle: Bundle? = intent.extras

        bundle?.let {
            key = bundle.getInt("Flag")
        }

        when(key) {
            1 -> pdfV("harry-potter-book-1.pdf", PDFv)
            2 -> pdfV("thealchimest.pdf", PDFv)
            3 -> pdfV("invisibleman.pdf", PDFv)
            4 -> pdfV("alice.pdf", PDFv)
            5 -> pdfV("rulesoflove.pdf", PDFv)
            6 -> pdfV("date.pdf", PDFv)
            7 -> pdfV("davincicode.pdf", PDFv)
            8 -> pdfV("Rich-Dad-Poor-Dad.pdf", PDFv)
            9 -> pdfV("attentionrevolution.pdf", PDFv)
            10 -> pdfV("lawsofpower.pdf", PDFv)
            11 -> pdfV("powerofthinking.pdf", PDFv)
            12 -> pdfV("thepowerofnow.pdf", PDFv)
            13 -> pdfV("wholenewmind.pdf", PDFv)
            14 -> pdfV("timemanagement.pdf", PDFv)
            15 -> pdfV("Spiderman.pdf", PDFv)
            16 -> pdfV("newkid.pdf", PDFv)
            17 -> pdfV("aladdin.pdf", PDFv)
            18 -> pdfV("first100words.pdf", PDFv)
            19 -> pdfV("goodnightmoon.pdf", PDFv)
            20 -> pdfV("sonic.pdf", PDFv)
            21 -> pdfV("corduroy.pdf", PDFv)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.libmenu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == R.id.item1){
            this.finish() //Back
        }

        else if (item.itemId == R.id.item2 && musicFlag==1) {
            musicFlag = 0
            stopService(Intent(this, MusicService::class.java))
            item.setIcon(R.drawable.ic_baseline_music_off_24)
        }

        else if (item.itemId == R.id.item2 && musicFlag==0) {
            musicFlag = 1
            startService(Intent(this, MusicService::class.java))
            item.setIcon(R.drawable.ic_baseline_music_note_24)
        }
        return super.onOptionsItemSelected(item)
    }


    fun pdfV(name: String, pdfview: PDFView){
        pdfview.fromAsset(name)
            .defaultPage(0) //starting page
            .enableAnnotationRendering(true)
            .scrollHandle(DefaultScrollHandle(this)) //scroller sign
            .spacing(2) //spacing between pages
            .load()
    }

}