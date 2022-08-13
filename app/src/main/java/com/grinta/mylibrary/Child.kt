package com.grinta.mylibrary

import android.content.ContentValues
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

class Child: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view2 = inflater.inflate(R.layout.fragment_child, container, false)
        val spiderman: TextView = view2.findViewById(R.id.SpiderTextViewID)
        val newkid: TextView = view2.findViewById(R.id.newkidTextViewID)
        val aladdin: TextView = view2.findViewById(R.id.aladdinTextViewID)
        val first100words: TextView = view2.findViewById(R.id.firstwordsTextViewID)
        val goodnightmoon: TextView = view2.findViewById(R.id.goodnightmoonTextViewID)
        val sonic: TextView = view2.findViewById(R.id.sonicTextViewID)
        val corduroy: TextView = view2.findViewById(R.id.corduroyTextViewID)
        val spidermanImage: ImageView = view2.findViewById(R.id.spidermanImage)
        val NewKidImage: ImageView = view2.findViewById(R.id.NewKidImage)
        val aladdinImage: ImageView = view2.findViewById(R.id.AaladdinImage1)
        val first100wordsImage: ImageView = view2.findViewById(R.id.First100WordsImage1)
        val goodnightmoonImage: ImageView = view2.findViewById(R.id.GoodNightMoonImage1)
        val sonicImage: ImageView = view2.findViewById(R.id.SonicImage1)
        val corduroyImage: ImageView = view2.findViewById(R.id.CurduroyImage1)
        var spidermanFav: ImageView = view2.findViewById(R.id.spidermanFav)
        var newkidFav: ImageView = view2.findViewById(R.id.newkidFav)
        var aladdinFav: ImageView = view2.findViewById(R.id.aladdinFav)
        var first100wordsFav: ImageView = view2.findViewById(R.id.first100wordsFav)
        var goodnightmoonFav: ImageView = view2.findViewById(R.id.goodnightmoonFav)
        var sonicFav: ImageView = view2.findViewById(R.id.sonicFav)
        var corduroyFav: ImageView = view2.findViewById(R.id.corduroyFav)
        var spidermanFavFlag: Int = 0
        var newkidFavFlag: Int = 0
        var aladdinFavFlag: Int = 0
        var first100wordsFavFlag: Int = 0
        var goodnightmoonFavFlag: Int = 0
        var sonicFavFlag: Int = 0
        var corduroyFavFlag: Int = 0

        spiderman.setOnClickListener{
           sendMessagetoPDF(15)
        }
        spidermanImage.setOnClickListener {
            sendMessagetoPDF(15)
        }
        spidermanFav.setOnClickListener {
            if(spidermanFavFlag == 0){
                checkFavourite(spiderman, spidermanFav, spidermanFavFlag)
                spidermanFavFlag = 1
            }
            else{
                checkFavourite(spiderman, spidermanFav, spidermanFavFlag)
                spidermanFavFlag = 0
            }
        }

        newkid.setOnClickListener {
            sendMessagetoPDF(16)
        }
        NewKidImage.setOnClickListener {
            sendMessagetoPDF(16)
        }
        newkidFav.setOnClickListener {
            if(newkidFavFlag == 0){
                checkFavourite(newkid, newkidFav, newkidFavFlag)
                newkidFavFlag = 1
            }
            else{
                checkFavourite(newkid, newkidFav, newkidFavFlag)
                newkidFavFlag = 0
            }
        }

        aladdin.setOnClickListener {
            sendMessagetoPDF(17)
        }
        aladdinImage.setOnClickListener {
            sendMessagetoPDF(17)
        }
        aladdinFav.setOnClickListener {
            if(aladdinFavFlag == 0){
                checkFavourite(aladdin, aladdinFav, aladdinFavFlag)
                aladdinFavFlag = 1
            }
            else{
                checkFavourite(aladdin, aladdinFav, aladdinFavFlag)
                aladdinFavFlag = 0
            }
        }

        first100words.setOnClickListener{
            sendMessagetoPDF(18)
        }
        first100wordsImage.setOnClickListener {
            sendMessagetoPDF(18)
        }
        first100wordsFav.setOnClickListener {
            if(first100wordsFavFlag == 0){
                checkFavourite(first100words, first100wordsFav, first100wordsFavFlag)
                first100wordsFavFlag = 1
            }
            else{
                checkFavourite(first100words, first100wordsFav, first100wordsFavFlag)
                first100wordsFavFlag = 0
            }
        }

        goodnightmoon.setOnClickListener {
            sendMessagetoPDF(19)
        }
        goodnightmoonImage.setOnClickListener {
            sendMessagetoPDF(19)
        }
        goodnightmoonFav.setOnClickListener {
            if(goodnightmoonFavFlag == 0){
                checkFavourite(goodnightmoon, goodnightmoonFav, goodnightmoonFavFlag)
                goodnightmoonFavFlag = 1
            }
            else{
                checkFavourite(goodnightmoon, goodnightmoonFav, goodnightmoonFavFlag)
                goodnightmoonFavFlag = 0
            }
        }

        sonic.setOnClickListener {
            sendMessagetoPDF(20)
        }
        sonicImage.setOnClickListener {
            sendMessagetoPDF(20)
        }
        sonicFav.setOnClickListener {
            if(sonicFavFlag == 0){
                checkFavourite(sonic, sonicFav, sonicFavFlag)
                sonicFavFlag = 1
            }
            else{
                checkFavourite(sonic, sonicFav, sonicFavFlag)
                sonicFavFlag = 0
            }
        }

        corduroy.setOnClickListener {
            sendMessagetoPDF(21)
        }
        corduroyImage.setOnClickListener {
            sendMessagetoPDF(21)
        }
        corduroyFav.setOnClickListener {
            if(corduroyFavFlag == 0){
                checkFavourite(corduroy, corduroyFav, corduroyFavFlag)
                corduroyFavFlag = 1
            }
            else{
                checkFavourite(corduroy, corduroyFav, corduroyFavFlag)
                corduroyFavFlag = 0
            }
        }
        return view2
    }

    fun checkFavourite(BookName: TextView, FavouriteImage: ImageView, favFlag: Int){
        if (favFlag == 0) {
            FavouriteImage.setImageDrawable(ContextCompat.getDrawable(requireView().context, R.drawable.heart))
            Toast.makeText(requireView().context, "Added to favourite list", Toast.LENGTH_LONG).show()

            val values = ContentValues()
            values.put(LibraryProvider.NAME, BookName.text.toString())
            context?.contentResolver?.insert(LibraryProvider.CONTENT_URI, values)
        } else {
            FavouriteImage.setImageDrawable(ContextCompat.getDrawable(requireView().context, R.drawable.emptyheart))
            Toast.makeText(requireView().context, "Removed from favourite list", Toast.LENGTH_LONG).show()

            val selection = "name = \"" + BookName.text.toString() + "\""

            val rowsDeleted = context?.contentResolver?.delete(
                LibraryProvider.CONTENT_URI,
                selection, null
            )
        }
    }

    fun sendMessagetoPDF(code: Int){
        val PDFIntent = Intent(context, PDFViewer::class.java)
        PDFIntent.putExtra("Flag", code)
        startActivity(PDFIntent)
    }
}